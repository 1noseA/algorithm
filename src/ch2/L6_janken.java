package ch2;

import java.util.Scanner;

// p.98余りを利用したじゃんけん勝敗判定プログラム
// 1:グー, 2:チョキ, 3:パー
public class L6_janken {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("1~3の数字を入力してください。太郎：");
	    int T = sc.nextInt();
	    System.out.print("\n1~3の数字を入力してください。花子：");
	    int H = sc.nextInt();

	    // グーを0、チョキを1、パーを2に変換
	    // 0, 1, 2に変換して3で割った余を求めると花子と同じ値になる
	    T = T - 1;
	    H = H - 1;

	    if (T == H) {
	    	System.out.println("あいこです。");
	    } else {
	        if (H == (T + 1) % 3) {
	        	System.out.println("太郎の勝ち！");
	        } else {
	        	System.out.println("花子の勝ち！");
	        }
	    }
	}
}
