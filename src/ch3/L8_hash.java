package ch3;

import java.util.Scanner;

/**
 * ハッシュ法探索…データを格納するときにデータの格納位置を決めて、特定のデータを一発で探せるようにしたもの
 * p.171の流れ図をもとに
 */
public class L8_hash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ハッシュ表
		int[] H = new int[10];
		H[2] = 532;
		H[3] = 463;
		H[8] = 298;

	    System.out.print("データを入力してください：");
	    int d = sc.nextInt();

	    // ハッシュ値の計算
	    int n = d % 10;
	    if (d == H[n]) {
	    	System.out.println("探索成功！" + (n+1) + "番目です");
	    } else {
	    	System.out.println("該当データなし");
	    }
	}
}
