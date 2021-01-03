package ch1;

import java.util.Scanner;

/**
 * 自動販売機を作ろう
 * ・使用できる硬貨：10円玉、50円玉、100円玉
 * ・投入された金額を「現在の金額」のところに表示する
 * ・購入できる飲料：各60円 牛乳、コーラ、オレンジ
 * ・各商品ボタンを押すと購入できる
 * ・お釣りが返却口に出る
 * p.23の流れ図を参考に
 */
public class L1_jihanki {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    int total = 0;
	    int coin = 0;
	    while(true) {
	    	System.out.print("10、50、100円玉のいずれかを投入してください。合計金額" + total + "円");
		    coin = sc.nextInt();
		    if (coin != 10 && coin != 50 && coin != 100) {
		    	continue;
		    }
		    total += coin;
		    System.out.println("合計金額：" + total + "円");
		    if (total >= 60) {
		    	break;
		    }
	    }
	    while(true) {
	    	System.out.println("飲料を牛乳、コーラ、オレンジの中から選んでください。");
		    String drink = sc.next();
		    if (!(drink.equals("牛乳") || drink.equals("コーラ") || drink.equals("オレンジ"))) {
		    	continue;
		    } else {
		    	break;
		    }
	    }
	    total -= 60;
	    if (total != 0) {
	    	System.out.println("おつりは" + total + "円です。");
	    	total = 0;
	    }
	    System.out.println("合計金額：" + total + "円です。");
	}
}
