package tasks;

import java.util.Arrays;

public class Task2 {

	public void removedDuplicates(int[] arr) {
		int[] temp = new int[arr.length];

		int k = 0;
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[k++] = arr[i];
			}
		}

		temp[k] = arr[arr.length - 1];
		
		for (int i = 0; i <= k; i++) {
			System.out.println(temp[i]);
		}
		
//		int[] result = new int[k + 1];
//		for (int h = 0; h <= k; h++) {
//			result[h] = temp[h];
//		}
//		return result;
	}
}
