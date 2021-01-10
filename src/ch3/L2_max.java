package ch3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 5つのりんごの最大値
 * p.143の流れ図を見ながら
 */
public class L2_max {
	public static void main(String[] args) {
		int apple[] = new int[5];
		int max = 0;

		// 1〜5の整数値を持つリストを用意
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 5; i++) {
			list.add(i);
		}
		// shuflleメソッドで上で作ったリストをシャッフル
		Collections.shuffle(list);

		for (int i = 0; i < 5; i++) {
			apple[i] = list.get(i);
			// 1番目のりんごを最大値に記憶する
			if (i == 0) {
				max = apple[i];
			}
			if (max < apple[i]) {
				max = apple[i];
			}
		}
		System.out.println("一番大きいりんごは" + max + "です。");
	}
}
