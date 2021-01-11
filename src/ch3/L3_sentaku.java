package ch3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *りんごを小さい順に並べ替える
 *選択ソート…最小値を1つ選択して先頭に置く
 */
public class L3_sentaku {
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

	    // りんご数ループ
	    for (int i = 0; i < a.length; i++) {
	    	int m = i;
	    	// 最小値ループ（一番小さいりんごを探す）
	    	for (int j = i + 1; j < a.length; j++) {
	    		if (a[m] > a[j]) {
	    			m = j;
	    		}
	    	}
	    	// 小さいりんごをa[i]に置く
	    	if (i != m) {
	    		int work = a[i];
	    		a[i] = a[m];
	    		a[m] = work;
	    	}
	    }
	    for (int i = 0; i < a.length; i++) {
	    	System.out.print(a[i]);
	    }
	    System.out.println("");


	    // 選択ソートサンプルコード
	    int[] data = {8, 6, 10, 4, 2};
	    for (int i = 0; i < data.length - 1; i++) {
	    	int min = i;
	    	for (int j = i + 1; j < data.length; j++) {
	    		if (data[min] > data[j]) {
	    			min = j;
	    		}
	    	}
	    	int tmp = data[i];
	    	data[i] = data[min];
	    	data[min] = tmp;
	    }
	    for (int i = 0; i < data.length; i++) {
	    	if (i == data.length -1) {
	    		System.out.println(data[i]);
	    	} else {
	    		System.out.print(data[i] + " ");
	    	}
	    }

	    // Maxを後ろから置いていく選択ソートp.150
	    int [] data2 = {8, 6, 10, 4, 2};
	    for (int i = data2.length-1; i >= 1; i--) {
	    	int max = i;
	    	for (int j = i - 1; j >= 0; j--) {
	    		if (data2[max] < data2[j]) {
	    			max = j;
	    		}
	    	}
	    	int tmp2 = data2[i];
	    	data2[i] = data2[max];
	    	data2[max] = tmp2;
	    }
	    for (int i = 0; i < data2.length; i++) {
	    	System.out.print(data2[i]);
	    }
	}
}
