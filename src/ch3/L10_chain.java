package ch3;

import java.util.Scanner;

/**
 * チェイン法…あらかじめシノニムコードの領域を用意しておき、衝突が発生したら、そこへポインタでつなぐ
 * p.180の流れ図をもとに
 */
public class L10_chain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ハッシュ表
		int[] H = new int[10];
		// ポインタ
		int[] P = new int[10];
		H[0] = 110;
		H[1] = 111;
		H[2] = 112;
		H[3] = 113;
		H[4] = 114;
		H[5] = 120;
		H[6] = 130;
		P[0] = 6;
		P[1] = 0;
		P[2] = 0;
		P[3] = 0;
		P[4] = 0;
		P[5] = 7;
		P[6] = 0;

		System.out.print("探索するデータを入力してください：");
	    int d = sc.nextInt();

	    // ハッシュ値
	    int n = d % 5;
	    int flg = 0;

	    out: while (n > 0) {
	    	if (H[n] == d) {
	    		flg = n;
	    		break out;
	    	} else {
	    		n = P[n];
	    	}
	    	if (n <= 0) {
	    		break out;
	    	}
	    }

	    if (flg > 0) {
	    	System.out.println("探索成功：" + (flg+1) + "番目");
	    } else {
	    	System.out.println("該当データなし");
	    }
	}
}
