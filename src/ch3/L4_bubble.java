package ch3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *バブルソート（交換ソート）…隣同士を比較して右側が大きな値になるように交換していく
 */
public class L4_bubble {
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

		for (int i = n; i >= 2; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (a[j] > a[j+1]) {
					int work = a[j];
					a[j] = a[j+1];
					a[j+1] = work;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println("");

		// バブルソートサンプルコード
		int[] data = {5, 10, 3, 7, 8, 1, 9};
		for (int i = data.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j+1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		for (int i = 0; i <data.length; i++) {
			System.out.print(data[i]);
		}
		System.out.println("");
	}
}
