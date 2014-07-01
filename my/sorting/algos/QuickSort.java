package my.sorting.algos;

import java.util.Arrays;

public class QuickSort {

	public static int[] sort(int[] array) {
		quickSort(array, 0, array.length - 1);
		return array;
	}

	public static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int q = partitionArray(array, start, end);
			quickSort(array, start, q - 1);
			quickSort(array, q + 1, end);
		}
	}

	private static void swapElements(int a[], int i, int j) {

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int partitionArray(int[] array, int start, int end) {

		int pIndex = 0;
		int length = array.length;
		int pivot = array[end];
		for (int i = 0; i < length - 1; i++) {
			if (array[i] <= pivot) {
				swapElements(array, pIndex, i);
				pIndex++;
			}
		}
		swapElements(array, pIndex, end);
		return pIndex;
	}

	public static void main(String[] args) {
		int[] array = { 45, 69, 32, 32, 31, 10 };

		System.out.println(Arrays.toString(sort(array)));
	}
}
