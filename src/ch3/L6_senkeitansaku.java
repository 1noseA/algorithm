package ch3;

import java.util.Scanner;

/**
 * 線形探索法…データを1件目から順々に比較して探していく
 * p.163の流れ図をもとに
 */
public class L6_senkeitansaku {
	public static void main(String[] args) {
		// 探索したいデータ
		String tansaku = "太郎";
		String[] name = {"まき", "ななみ", "はるこ", "かなみ", "さゆり", "あいこ", "太郎", "わかこ", "やすよ", "らん"};

		for (int i = 0; i < name.length; i++) {
			if (name[i].equals(tansaku)) {
				System.out.println("探索完了!" + (i+1) + "番目でした。");
				break;
			}
		}

		// サンプルプログラム
		Scanner sc = new Scanner(System.in);
		int a[] = {66, 2, 10, 43, 45, 52, 73, 65, 12, 39, 97, 76, 83, 11, 57, 63};
		System.out.println("データを入力してください。：");
		int x = sc.nextInt();
		int pos = -1;
		for (int j = 0; j < a.length; j++) {
			if (a[j] == x) {
				pos = j;
				break;
			}
		}
		if (pos < 0) {
			System.out.println("見つかりません");
		} else {
			System.out.println(x + "は" + pos + "番目です");
		}
	}
}
