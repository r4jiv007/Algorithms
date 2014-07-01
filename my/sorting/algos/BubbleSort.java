package my.sorting.algos;

import java.util.Arrays;

public class BubbleSort {

	private static int[] sort(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length ; j++) {
				if (array[i] >= array[j]) {
					swapElements(array, i, j);
				}
			}
		}
		return array;
	}

	private static void swapElements(int a[], int i, int j) {

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int[] array = { 45, 69, 32, 35, 31, 10 };

		System.out.println(Arrays.toString(sort(array)));
	}
}
