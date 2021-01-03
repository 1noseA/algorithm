package ch2;

import java.util.Scanner;

// p.106勝敗表（二次元配列）を用いたじゃんけん勝敗判定プログラム
// 0:グー, 1:チョキ, 2:パー, 3:OK
public class L7_janken {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    int t = 0;
	    int h = 0;

	    int table[][] = {{2, 0, 1, 1}, {1, 2, 0, 1}, {0, 1, 2, 1}, {0, 0, 0, 2}};
	    String[] s = {"太郎の勝ち！", "花子の勝ち！", "あいこ"};

	    System.out.println("10回勝負はじめ！");

	    int tcount = 0;
	    int hcount = 0;
	    // じゃんけんを10回繰り返す
	    int i = 1;
	    while(i <= 10) {
	    	System.out.print("0~3の数字を入力してください。太郎：");
		    t = sc.nextInt();
		    System.out.print("\n0~3の数字を入力してください。花子：");
		    h = sc.nextInt();

		    // OKは1回までしか使えない
		    if (tcount == 1 && t == 3) {
		    	System.out.println("太郎さん、3は一度しか使えません");
		    	continue;
		    } else if (hcount == 1 && h == 3) {
		    	System.out.println("花子さん、3は一度しか使えません");
		    	continue;
		    }
		    if (tcount == 0 && t == 3) {
		    	tcount = 1;
		    } else if (hcount == 0 && h == 3) {
		    	hcount = 1;
		    }

		    System.out.println(s[table[t][h]]);
	    	i++;
	    }
	    System.out.println("試合終了！");
	}
}
