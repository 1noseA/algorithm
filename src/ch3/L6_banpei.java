package ch3;

import java.util.Arrays;

/**
 * 線形探索法(番兵法)…探索データを配列の最後(データがN件ならばN+1件目)に置く方法
 * p.164の流れ図をもとに
 */
public class L6_banpei {
	public static void main(String[] args) {
		String[] name = {"まき", "ななみ", "はるこ", "かなみ", "さゆり", "あいこ", "太郎", "わかこ", "やすよ", "らん"};
		// 番兵追加
		String[] name2 = {"まき", "ななみ", "はるこ", "かなみ", "さゆり", "あいこ", "太郎", "わかこ", "やすよ", "らん", "太郎"};
		// 探索したいデータ
		String tansaku = name2[name2.length-1];

		// ?
		// 番兵法は、全部で何件あるか分からないときに、ループを終了する方法です。
		// 一方、for（カウンター方式）は、通常、配列ならlengthプロパティ、listならlengthメソッドといった具合に
		// 何件処理したらループを終了するか分かっているときに使います
//		int i = 0;
//		for (; i <= 10; i++) {
//		}

		int n = 0;
		while (name2[n] != tansaku) {
			n++;
		}

		if (n >= name2.length-1) {
			System.out.println("該当データなし");
		} else {
			System.out.println("探索完了!" + (n+1) + "番目でした。");
		}

		// サンプルプログラム
		new L6_banpei().test();
	}

	public void test() {
		int[] nums = {3, 4, 1, 5, 2, 6};
		boolean res;

		res = search(nums, 5);
		System.out.println(res);

		System.out.println("--");

		res = search(nums, 7);
		System.out.println(res);
	}

	public boolean search(int nums[], int target) {
		System.out.println("配列：" + Arrays.toString(nums));
		System.out.println("探す値：" + target);

		int[] tempNums = new int[nums.length + 1];
		System.arraycopy(nums,  0,  tempNums,  0,  nums.length);
		tempNums[tempNums.length - 1] = target;
		System.out.println("番兵追加：" + Arrays.toString(tempNums));

		int index = 0;
		while (tempNums[index] != target) {
			index++;
		}

		System.out.println("要素番号：" + index);
		return index < tempNums.length - 1;
	}
}
