package ch2;

import java.util.Scanner;

// p.95の流れ図を見ながらじゃんけんプログラム
// 1:グー, 2:チョキ, 3:パー
public class L5_janken {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("1~3の数字を入力してください。太郎：");
	    int T = sc.nextInt();
	    System.out.print("\n1~3の数字を入力してください。花子：");
	    int H = sc.nextInt();

	    if (T == H) {
	    	System.out.println("あいこです。");
	    } else {
	    	int hand = T + 1;
	    	if (hand > 3) {
	    		// 4のときは1にする
	    		hand = 1;
	    	}

	        if (hand == H) {
	        	System.out.println("太郎の勝ち！");
	        } else {
	        	System.out.println("花子の勝ち！");
	        }
	    }
	}
}
