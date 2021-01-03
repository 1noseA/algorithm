package ch2;

import java.util.Scanner;

/**
 * お釣りの計算(テーブルを使って)
 * 10円玉、50円玉、100円玉、500円玉
 */
public class L9_turisen2 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("定価：");
	    int total = sc.nextInt();
	    System.out.print("お金：");
	    int pay = sc.nextInt();

	    // お釣り
	    int change = pay - total;
	    //System.out.println("お釣りは" + change + "円です。");

	    int n = 3;
	    int coin[] = {10, 50, 100, 500};
	    int num[] = {0, 0, 0, 0};

	    while(true) {
	    	num[n] = change / coin[n];
	    	change = change % coin[n];
	    	if(change == 0) {
	    		System.out.println(coin[n] + "円玉は" + num[n] + "枚です。");
	    		break;
	    	} else {
	    		System.out.print(coin[n] + "円玉は" + num[n] + "枚、");
	    		n--;
	    	}
	    }
	}
}
