package tasks;

public class Tasks {
	
	public int findLargestIndex(int[] arr) {
		//if arr length is 0
		if (arr.length == 0) {
			return -1;
		}
		
		int temp = 0;
		
		for (int i = 1 ; i < arr.length ; i++) {
			if(arr[i] >= arr[temp]) {
				temp = i;
			}
		}
		return temp;
	}
	
	public int findSmallestIndex(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}
		
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= arr[temp]) {
				temp = i;
			}
		}
		return temp;
	}
}
