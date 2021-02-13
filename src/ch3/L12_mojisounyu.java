package ch3;

import java.util.Scanner;

/**
 * 練習問題
 * Min(X, Y)…X < YのときはXを返し、それ以外の時はYを返す
 * p.189の擬似言語プログラムを見ながら
 */
public class L12_mojisounyu {
	public static void main(String[] args) {
		String[] A = new String[15];
		A[0] = "A";
		A[1] = "B";
		A[2] = "C";
		A[3] = "D";
		A[4] = "E";
		A[5] = "F";
		A[6] = "G";
		A[7] = "H";
		A[8] = "I";
		A[9] = "J";
		int Amax = 15;
		int AX = 9;

		// 挿入する文字列
		String[] B = {"1", "2", "3", "4", "5", "6"};
		// 挿入する文字列の長さ
		int BX = B.length;

		Scanner sc = new Scanner(System.in);
		// 挿入位置
		int PX = 0;
		while (true) {
			PX = sc.nextInt();
			if (PX > Amax) {
				System.out.println(Amax + "以下の数字をもう一度入力してください");
			} else {
				break;
			}
		}

		int Y = 0;

		// 挿入位置が文字列の長さ+1より小さい場合、配列Aを後ろにずらす
		if (PX < AX + 1) {
			Y = Amax - BX < AX ? Amax - BX : AX;
			for (int X = Y; X >= PX; X--) {
				if (X + BX < Amax) {
					A[X + BX] = A[X];
				}
			}
		} else if (PX > AX + 1) {
			for (int X = AX + 1; X <= PX - 1; X++) {
				A[X] = " ";
			}
		}
		// 確認用
		for (int i = 0; i < Amax; i++) {
			System.out.print(A[i]);
		}
		System.out.println("");

		// 挿入する
		Y = PX + BX - 1 < Amax ? PX + BX - 1 : Amax;
		for (int X = PX; X <= Y; X++) {
			A[X - 1] = B[X - PX];
		}
		for (int i = 0; i < Amax; i++) {
			System.out.print(A[i]);
		}
	}
}
