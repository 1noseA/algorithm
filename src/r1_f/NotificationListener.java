package r1_f;

import java.util.List;

/**
 * 通知メッセージを受け取るためのメソッドを定義する。
 * インスタンスをリスナという。
 */
public interface NotificationListener {
	void onNotificationReceived(List<String> messageList);
}
