package ch4;

public class QuickSort {
	public static void sort(int[] array, int left, int right) {
		if (left <= right) {
			int p = array[(left + right) >>> 1];
			int l = left;
			int r = right;

			while (l <= r) {
				while (array[l] < p) {
					l++;
				}
				while (array[r] > p) {
					r--;
				}
				if (l <= r) {
					int tmp = array[l];
					array[l] = array[r];
					array[r] = tmp;
					l++;
					r--;
				}
			}
			QuickSort.sort(array, left, r);
			QuickSort.sort(array, l, right);
		}
	}

	public static void main(String[] args) {
		int[] test = {10, 75, 24, 32, 98, 72, 88, 43, 60, 35, 54, 62, 2, 12, 82};
		QuickSort.sort(test,  0,  test.length - 1);
		for (int i = 0; i < test.length; i++) {
			System.out.println((i+1) + ":" + test[i]);
		}
	}
}
