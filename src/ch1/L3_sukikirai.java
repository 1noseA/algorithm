package ch1;

/**
 * 花占いプログラムp.37
 * ・はじめに乱数で花びらの枚数を設定する。
 * ・最初の花びらは「好き」から始める。
 * ・「Enter」キーを押すたびに、交互に「好き」、「嫌い」と表示する。
 */
public class L3_sukikirai {
	// ディスプレイに「好き」と表示されていたら、次は「嫌い」
	// 「嫌い」と表示されていたら、次は「好き」
	// 2つの状態を交互に切り替えるにはスイッチを使うのが一般的
	public static void main(String[] args) {
		//1以上10以下の乱数を取得する
		int hanabira = (int)(Math.random() * 10) + 1;
		System.out.println("花びら" + hanabira + "枚");

		// 変数SW 1:「好き」、0:「嫌い」
		int SW = 1;

		while (true) {
			System.out.println(getSukiKirai(SW));
			hanabira--;
			if (hanabira == 0) {
				break;
			}
			if (SW == 1) {
				SW = 0;
			} else {
				SW = 1;
			}
		}
		System.out.println("あなたのことが" + getSukiKirai(SW) + "です！");
	}

	public static String getSukiKirai(int SW) {
		if (SW == 0) {
			return "嫌い";
		} else {
			return "好き";
		}
	}
}
