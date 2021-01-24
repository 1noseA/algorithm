package ch3;

import java.util.Scanner;

/**
 * 2分探索法(バイナリサーチ)…まず中央を調べて前半にあるか後半にあるかを判断し、
 * 探索範囲を半分に絞り込んでいくことを繰り返す。
 * データが昇順か降順に整列されていなければならない。
 * p.168の流れ図をもとに
 */
public class L7_nibuntansaku {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int tansaku = 6;
		int low = 1;
		int high = a.length + 1;
		int mid = 0;

		while (low < high) {
			mid = (low + high) / 2;
			if (a[mid] < tansaku) {
				low = mid + 1;
			} else if (a[mid] > tansaku) {
				high = mid - 1;
			} else if (a[mid] == tansaku) {
				System.out.println("探索完了！" + (mid+1) + "番目です。");
				break;
			}
		}
		if (a[mid] != tansaku) {
			System.out.println("該当データなし！");
		}

		// サンプルプログラム
		Scanner sc = new Scanner(System.in);
		int b[] = {2, 10, 11, 12, 39, 43, 45, 52, 57, 63, 65, 66, 73, 76, 83, 97};
		System.out.print("データを入力して下さい: ");
		// 探索したいデータを入力する
		int t = sc.nextInt();
		int pos = -1;
		int L = 0; // 下限
		int H = b.length - 1; // 上限
		while (L <= H) {
			int M = (L + H) / 2;
			if(b[M] == t) {
				pos = M;
				break;
			} else if (b[M] < t) {
				L = M + 1;
			} else {
				H = M - 1;
			}
		}
		if (pos < 0) {
			System.out.println("見つかりません");
		} else {
			System.out.println(t + "は" + (pos+1) + "番目です");
		}

	    // binarySearch(検索される配列, 検索される値)というのもあるらしい
	}
}
