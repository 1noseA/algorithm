package ch2;

import java.util.Scanner;

/**
 * お釣りの計算
 */
public class L9_turisen {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("定価：");
	    int total = sc.nextInt();
	    System.out.print("お金：");
	    int pay = sc.nextInt();

	    // お釣り
	    int change = pay - total;
	    System.out.println("お釣りは" + change + "円です。");

	    // 硬貨の枚数
	    int hundred = 0;
	    int fifty = 0;
	    int ten = 0;

	    if (change >= 100) {
	    	hundred = change / 100;
	    	change = change % 100;
	    }
	    if (change >= 50) {
	    	fifty = change / 50;
	    	change = change % 50;
	    }
	    if (change >= 10) {
	    	ten = change /10;
	    	change = change % 10;
	    }

	    System.out.println("100円玉" + hundred + "枚、50円玉" + fifty + "枚、10円玉" + ten + "枚です。");
	}
}
