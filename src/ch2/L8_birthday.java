package ch2;

import java.util.Scanner;

/**
 * 誕生日は何曜日？
 */
public class L8_birthday {
	public static void main(String[] args) {
		// ひと月の日数
	    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	    Scanner sc = new Scanner(System.in);

	    int m = 0;
	    int d = 0;

	    while(true) {
	    	System.out.print("誕生日を教えてください。月：");
		    m = sc.nextInt();
	    	if (m < 1 || m > 12) {
		    	System.out.println("誕生月は1〜12の数字で入力してください");
		    	continue;
		    } else {
		    	System.out.print("日：");
			    d = sc.nextInt();
			    if (d < 1 || d > days[m-1]) {
			    	System.out.println("誕生日の入力が正しくありません。");
			    	continue;
			    } else {
			    	break;
			    }
		    }
	    }

	    // 通算日数
	    int total = 0;
	    for (int i = 0; i < m - 1; i++) {
	    	total += days[i];
	    }

	    System.out.println("元日から誕生日まで" + (total + d) + "日です。");
	}
}
