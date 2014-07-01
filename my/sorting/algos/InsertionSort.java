package my.sorting.algos;

import java.util.Arrays;

public class InsertionSort {

	public static int[] sort(int[] array) {
		int length = array.length;
		for (int i = 1; i < length; i++) {
			int j = i - 1;
			int temp = array[i];
			while (j >= 0 && temp < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			j++;
			array[j] = temp;
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = { 45, 69, 32, 35, 31, 10 };

		System.out.println(Arrays.toString(sort(array)));
	}

}
