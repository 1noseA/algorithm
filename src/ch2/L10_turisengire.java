package ch2;

import java.util.Scanner;

/**
 * 釣り銭切れ
 * p.120の流れ図を参考に
 */
public class L10_turisengire {
	public static void main(String[] args) {
		// 硬貨テーブル（金額）
		int coin[] = {10, 50, 100, 500};

		// 販売機テーブル（自動販売機にある硬貨の枚数）
		int jihanki[] = {100, 50, 100, 10};

		// 投入金テーブル（投入した硬貨の枚数）
		int tounyu[] = {0, 0, 0, 0};

		// 枚数（お釣りの硬貨の枚数）
		int oturi[] = {0, 0, 0, 0};

		// 合計金額
		//int total = 0;

		// お釣り
		int change = 0;

	    Scanner sc = new Scanner(System.in);
	    int n = 0;

	    out:while(true) {
	    	System.out.print("お金を投入してください。0：10円玉、1：50円玉、2：100円玉、3：500円玉");
		    n = sc.nextInt();
		    tounyu[n] += 1;

		    // 投入金の計算
		    int total = 0;
		    for (int i = 0; i < 4; i++) {
		    	total += coin[i] * tounyu[i];
		    }
		    System.out.println("投入金額：" + total + "円です。");

		    if (total >= 120) {
		    	change = total - 120;
		    	// 投入された硬貨を自動販売機の中の硬貨の枚数に加える
		    	for (int i = 0; i < 4; i++) {
		    		jihanki[i] = jihanki[i] + tounyu[i];
		    	}

		    	// お釣りの計算
		    	if (change > 0) {
		    		// coin[3]の500円玉から見ていく
		    		for (int i = 3; i >= 0; i--) {
		    			while (jihanki[i] > 0 && coin[i] <= change) {
		    				change = change - coin[i];
			    			jihanki[i] = jihanki[i] - 1;
			    			oturi[i] = oturi[i] + 1;
		    			}
		    			if (jihanki[i] == 0) {
		    				System.out.println(coin[i] + "円玉、釣り銭切れ");
		    				continue;
		    			}
		    		}
		    		break out;
		    		// 問題作
//		    		for (int i = 3; jihanki[i] <= 0 || coin[i] > change; i--) {
//		    			change = change - coin[i];
//		    			jihanki[i] = jihanki[i] - 1;
//		    			oturi[i] = oturi[i] + 1;
//		    			if (jihanki[i] == 0) {
//		    				System.out.println(coin[i] + "円玉、釣り銭切れ");
//		    			}
//		    		}
		    	}
		    } else {
		    	System.out.println("入金不足です。");
		    }
	    }

	    // 表示
	    for (int i = 0; i < 4; i++) {
	    	System.out.print(coin[i] + "円玉は");
	    	System.out.print("投入されたのは" + tounyu[i] + "枚で、");
	    	System.out.print("お釣りに" + oturi[i] + "枚使って、");
	    	System.out.println("現在自動販売機に" + jihanki[i] + "枚あります。");
	    }
	}
}
