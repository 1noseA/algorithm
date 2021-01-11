package ch3;

/**
 *途中で小さい順に並んだらプログラムを終了するバブルソート
 */
public class L4_bubble2 {
	public static void main(String[] args) {
		int[] A = {5, 10, 3, 7, 8, 1, 9};
		for (int K = 0; K < A.length; K++) {
			// スイッチ（1回でも交換が起きたら0、1回も起きなかったら1になる）
			int X = 1;
			for (int L = A.length-1; L > K; L--) {
				if (A[L-1] > A[L]) {
					int W = A[L];
					A[L] = A[L-1];
					A[L-1] = W;
					X = 0;
				}
			}
			if (X == 1) {
				// K = A.length;
				break;
			}
		}
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
		}
		System.out.println("");
	}
}
