package ch2;

import java.util.Scanner;

// p.101余りを利用したじゃんけん勝敗判定プログラム
// 1:グー, 2:チョキ, 3:パー
public class L6_janken2 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("1~3の数字を入力してください。太郎：");
	    int T = sc.nextInt();
	    System.out.print("\n1~3の数字を入力してください。花子：");
	    int H = sc.nextInt();

	    int hand = (T - H + 3) % 3;

	    if (hand == 0) {
	    	System.out.println("あいこです。");
	    } else {
	        if (hand == 1) {
	        	System.out.println("花子の勝ち！");
	        } else {
	        	System.out.println("太郎の勝ち！");
	        }
	    }
	}
}
