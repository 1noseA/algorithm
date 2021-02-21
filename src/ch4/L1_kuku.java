package ch4;

/**
 * p.207の流れ図を見ながら
 */
public class L1_kuku {
	public static void main(String[] args) {
		int[][] H = new int[9][9];
		for (int i = 1; i <= H.length; i++) {
			for (int j = 1; j <= H.length; j++) {
				H[9 - i][9 - j] = i * j;
			}
		}
		for (int i = 0; i < H.length; i++) {
			for (int j = 0; j < H.length; j++) {
				if (H[i][j] < 10) {
					System.out.print(" " + H[i][j] + " ");
				} else {
					System.out.print(H[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}
}
