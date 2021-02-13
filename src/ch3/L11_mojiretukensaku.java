package ch3;

/**
 * 文字列処理 文字データもハッシュ表に格納できる
 * p.186の流れ図をもとに
 */
public class L11_mojiretukensaku {
	public static void main(String[] args) {
		// 文字列の配列M
		String[] M = {"ゆ", "り", "子", "ゆ", "り", "あ", "ゆ", "め", "代"};
		// 文字列の長さ
		int ML = M.length;

		// 検索語の配列K
		String[] K = {"ゆ", "り", "あ"};
		// 検索語の長さ
		int KL = K.length;

		// 配列Mの添字
		int MP = 0;
		// 先頭文字ループ
		for (; MP + KL <= ML; MP++) {
			// 配列Kの添字
			int KP = 0;
			// 比較ループ(わからん)
			for (; KP < KL; KP++) {
				if (M[MP] == K[KL-1]) {
					System.out.println("該当データあり" + (MP+1-KL+1));
					break;
				}
			}
		}
	}
}
