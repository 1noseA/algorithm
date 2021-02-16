package r1_f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 携帯端末の管理や通知メッセージの配信などを行う。
 * インスタンスはシングルトン。
 */
public final class Notifier {
	private static final Notifier INSTANCE = new Notifier();

	private final Object lock = new Object();

	// 利用者ごとに携帯端末を管理
	private final Map<String, List<MobileDevice>> userMobileDevices
		= new HashMap<>();

	// 携帯端末ごとに通知メッセージを保持
	private final Map<MobileDevice, List<String>> messagesToDeliver
		= new HashMap<>();

	private volatile boolean active = true;

	public static Notifier getInstance() {return INSTANCE;}

	private Notifier() {}

	// 引数で指定された利用者名とその携帯端末名を登録する。
	// 既に登録されている場合は追加登録
	public void register(String user, MobileDevice device) {
		synchronized (lock) {
			List<MobileDevice> devices = userMobileDevices.get(user);
			if (devices == null) {
				devices = new ArrayList<>();
				userMobileDevices.put(user, devices);
			}
			devices.add(device);
		}
	}

	// 引数で指定された利用者名で登録されている各携帯端末に、
	// 引数で指定された文字列を通知メッセージとして配信する。
	// 未配信のメッセージがある場合、未配信のメッセージリストに追加する。
	public void send(String user, String message) {
		List<MobileDevice> devices = new ArrayList<>();
		synchronized (lock) {
			if (userMobileDevices.containsKey(user)) {
				for (MobileDevice device : userMobileDevices.get(user)) {
					List<String> messageList = messagesToDeliver.get(device);
					if (messageList == null) {
						messageList = new ArrayList<>();
						messagesToDeliver.put(device, messageList);
					}
					messageList.add(message);
					devices.add(device);
				}
			}
		}

		for (MobileDevice device : devices) {
			synchronized (device) {
				// 通知メッセージがあることを待ち受け状態のスレッドに通知
				device.notifyAll();
			}
		}
	}

	// 引数で指定された携帯端末に対して、通知メッセージがあれば携帯端末のリスナに通知し、
	// なければ通知メッセージを受け取れる状態（待ち受け状態）にする。
	// 通知システムが停止されるまで繰り返す。
	public void loopForMessages(MobileDevice device) {
		while (active) {
			List<String> messageList;
			synchronized (lock) {
				messageList = messagesToDeliver.remove(device);
			}
			if (messageList != null) {
				device.getListener().onNotificationReceived(messageList);
			}
			synchronized (device) {
				try {
					// 通知メッセージが到着するかタイムアウトするまで待つ
					device.wait(3000L);
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}

	// 通知システムを停止する。未配信の全メッセージ、全利用者名および全携帯端末名の
	// 登録情報を削除し、登録されている全携帯端末の待ち受け状態を解除する。
	public void shutdown() {
		active = false;
		List<MobileDevice> devices = new ArrayList<>();
		synchronized (lock) {
			messagesToDeliver.clear();
			for (String user : userMobileDevices.keySet()) {
				for (MobileDevice device : userMobileDevices.get(user)) {
					devices.add(device);
				}
			}
			userMobileDevices.clear();
		}
		for (MobileDevice device : devices) {
			synchronized (device) {
				// 待ち受け状態のスレッドに通知
				device.notifyAll();
			}
		}
	}

}
