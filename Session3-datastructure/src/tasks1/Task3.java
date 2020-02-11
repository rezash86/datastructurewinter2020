package tasks1;

public class Task3 {
	
	public int[] reverseWithTempArray(int[] arr) {
		int[] tempArr = new int[arr.length];
		
		int k=0;
		for (int i = tempArr.length - 1; i >= 0; i--) {
			tempArr[k++]  = arr[i];
		}
		
		return tempArr;	
	}
	
	public int[] reverseWithoutTempArray(int[] arr) {
		int tmp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
		return arr;
	}

}
