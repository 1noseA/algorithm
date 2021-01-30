package ch3;

import java.util.Scanner;

/**
 * オープンアドレス法…ハッシュ表への格納時に衝突が発生したら空いているところに格納する
 * p.176の流れ図をもとに
 */
public class L9_openaddress {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ハッシュ表
		// -1は空きを意味する
		int[] H = {219, -1, 532, 463, 142, -1, -1, -1, 298, 308};

		System.out.print("探索するデータを入力してください：");
	    int d = sc.nextInt();

	    // ハッシュ値
	    int n = d % 10;
	    int m = n;
	    int flg = 0;

	    out: while (flg == 0) {
	    	// 探索データが見つかったとき
	    	if (H[m] == d) {
	    		flg = m;
	    	// 再ハッシュ値の要素が空(-1)であったとき
	    	} else if (H[m] == -1) {
    			flg = -1;
    	    } else {
    	    	m++;
    	        if (m == 10) {
    	        	m = 0;
		    	// 全てのデータと比較しても探索データと一致しないとき
		    	} else if (m == n) {
		    		flg = -1;
		    		break out;
		    	}
    	    }
	    }

	    if (flg > 0) {
	    	System.out.println("探索成功：" + (flg+1) + "番目です");
	    } else {
	    	System.out.println("該当データなし！");
	    }
	}
}
