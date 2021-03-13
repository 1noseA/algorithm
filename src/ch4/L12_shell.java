package ch4;

/**
 * シェルソート…挿入ソートを改良したもの
 * p.258の擬似言語プログラムを参考に
 */
public class L12_shell {
	public static void main(String[] args) {
		int[] ringo = {8, 7, 6, 5, 4, 3, 2, 1};
		// 個数(8)
		int a = ringo.length;
		// 外
		int s = 0;
		// 内
		int u = 0;
		// 間隔(4)
		int k = a / 2;
		// ワーク
		int w = 0;

		while (k > 0) {
			for (s = k; s < a; s++) {
				for (u = s; u >= k; u--) {
					if (ringo[u - k] > ringo[u]) {
						w = ringo[u];
						ringo[u] = ringo[u - k];
						ringo[u - k] = w;
					}
				}
			}
			k /= 2;
		}

		for (int i = 0; i < a; i++) {
			System.out.println(ringo[i]);
		}
	}
}
