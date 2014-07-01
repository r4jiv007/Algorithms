package my.sorting.algos;

import java.util.Arrays;

public class SelectionSort {
	private static int minIndex(int[] array, int startindex) {

		int length = array.length;
		int start = array[startindex];
		int index = -1;
		for (int i = startindex + 1; i < length; i++) {
			if (start >= array[i]) {
				start = array[i];
				index = i;
			}
		}

		return index;
	}

	private static void swapElements(int a[], int i, int j) {

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static int[] sort(int[] array) {
		int length = array.length;
		for (int i = 0; i < length-1; i++) {
			int minIndex = minIndex(array, i);
			if (minIndex >= 0)
				swapElements(array, i, minIndex);
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = { 45, 69, 32, 35, 31, 10 };

		System.out.println(Arrays.toString(sort(array)));
	}
}
