package r1_f;

/**
 * プログラムをテストする。
 */
public class Tester {
	public static void main(String[] args) throws InterruptedException {
		// Taroの携帯端末名を通知システムに登録してTaroにメッセージを送る。
		createUserMobileDevice("Taro", "phone");
		createUserMobileDevice("Taro", "tablet");
		Notifier notifier = Notifier.getInstance();
		notifier.send("Taro", "You have a message.");
		Thread.sleep(500L);
		// 通知システムを停止する
		notifier.shutdown();
	}

	// 利用者名とその携帯端末名を登録して、通知メッセージを受信できる状態にする。
	private static void createUserMobileDevice(String user, String name) {
		MobileDevice device = new MobileDevice(name, messageList ->
				System.out.println(name + ":" + messageList));
		Notifier notifier = Notifier.getInstance();
		notifier.register(user, device);
		// 新しく生成したスレッドで実行。
		new Thread(() -> {
			notifier.loopForMessages(device);
			System.out.printf("Terminating %s' s %s%n", user, name);
		}).start();
	}
}
