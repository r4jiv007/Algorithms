package my.sorting.algos;

import java.util.Arrays;

public class MergeSort {

	public static int[] sort(int[] array) {
		mergeSort(array, 0, array.length - 1);
		return array;
	}

	public static void mergeSort(int[] array, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(array, start, mid);
			mergeSort(array, mid + 1, end);
			merge(array, start, mid, end);
		}
	}

	public static void merge(int[] array, int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int[] Left = new int[n1 +1];
		int[] Right = new int[n2 +1];

		for (int i = 0; i < n1; i++) {
			Left[i] = array[start + i];
		}

		for (int i = 0; i <n2; i++) {
			Right[i] = array[mid + i+1];
		}
		
		Left[n1] = Integer.MAX_VALUE;
		Right[n2] = Integer.MAX_VALUE;

		for (int i = start, k = 0, j = 0; i <=end; i++) {
			if (Left[k] <= Right[j]) {
				array[i] = Left[k];
				k++;
			} else {
				array[i] = Right[j];
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 45, 69, 32, 35, 31, 10 };

		System.out.println(Arrays.toString(sort(array)));
	}
}
