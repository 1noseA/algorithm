package ch3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *りんごをはじめから並べていく
 *挿入ソート…データの並びを保ちながら適切な位置にデータを挿入していく
 */
public class L5_souniu {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("りんごの数を入力してください：");
	    int n = sc.nextInt();
	    List<Integer> apple = new ArrayList<>();
	    for (int i = 1; i <= n; i++) {
	    	apple.add(i);
	    }
	    Collections.shuffle(apple);
	    int a[] = new int[n];
	    for (int i = 0; i < apple.size(); i++) {
	    	a[i] = apple.get(i);
	    	System.out.print(a[i]);
	    }
	    System.out.println("");

	    for (int i = 0; i < a.length; i++) {
	    	// 配列の後から挿入する位置を探していく
	    	for (int j = i; j >= 1; j--) {
	    		// 隣同士を比較して挿入位置までりんごを移動したら抜ける
	    		if (a[j] < a[j-1]) {
	    			int work = a[j];
	    			a[j] = a[j-1];
	    			a[j-1] = work;
	    		}
	    	}
	    }
	    for (int i = 0; i < a.length; i++) {
	    	System.out.print(a[i]);
	    }
	    System.out.println("");

	    // 挿入コードのサンプル
	    // データの格納
	    int[] data = {3, 2, 8, 7, 5};

	    for (int i = 1; i < data.length; i++) {
	    	for (int j = i; j >= 1 && data[j] < data[j-1]; j--) {
	    		int tmp = data[j];
	    		data[j] = data[j-1];
	    		data[j-1] = tmp;
	    	}
	    }

	    for (int i = 0; i < data.length; i++) {
	    	System.out.print(data[i]);
	    }
	}
}
