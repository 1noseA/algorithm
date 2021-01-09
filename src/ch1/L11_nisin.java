package ch1;

import java.util.Scanner;

public class L11_nisin {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("10進数を2進数に変換します。数字を入力してください。");
	    int bin[] = new int[8];
	    int n = 0;
	    int x = sc.nextInt();
	    while(x >= 2) {
	    	bin[n] = x % 2;
	    	n++;
	    	x = x / 2;
	    }
	    // 最後1だったら1、0だったら0
	    bin[n] = x;
	    n++;
	    // 逆順に出力
	    for (int i = n - 1; i >= 0; i--) {
	    	System.out.print(bin[i]);
	    }
	    System.out.println("");

//	    int n = sc.nextInt();
//	    List<Integer> nisin = new ArrayList<>();
//	    while(true) {
//	    	nisin.add (n % 2);
//	    	n = n / 2;
//	    	if (n == 0) {
//	    		break;
//	    	}
//	    }
//	    System.out.println("2進数に変換すると");
//	    System.out.println(Collections.reverse(nisin));

	    // その他
	    int num1 = 255;
	    int num2 = num1;
	    String numstr = "";
	    while(num2 > 0) {
	    	int b = num2 % 2;
	    	if (b == 1) {
	    		numstr = "1" + numstr;
	    	} else {
	    		numstr = "0" + numstr;
	    	}
	    	num2 = num2 / 2;
	    }
	    if (num1 == 0) {
	    	numstr = "0";
	    }
	    System.out.println(num1 + "の2進数は" + numstr + "です。");

	    System.out.println ( Integer.toBinaryString(num1)); // 2進数
	}
}
