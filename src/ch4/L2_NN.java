package ch4;

/**
 * p.211の擬似プログラムを見ながら
 * N行N列の2次元配列
 */
public class L2_NN {
	public static void main(String[] args) {
		int N = 4;
		int[][] A = new int[N][N];
		int yesNo = 1;
		int x = 1;
		int y = 0;
		int count = 0;

		for (; x < N - 1 && yesNo == 1; x++) {
			for (y = x + 1; y < N && yesNo == 1; y++) {
				count++;
				if (A[x][y] != A[y][x]) {
					yesNo = 0;
				}
			}
		}
		if (yesNo == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println(count);
	}
}
