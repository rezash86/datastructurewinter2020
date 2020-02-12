package tasks2;

public class CustomSort {
	
	public void bubbleSort(int[] arr) {
		
		// arr = {3,4,1,2,8,7}
		for (int i=0; i<arr.length - 1; i++) {
			for (int j= i + 1; j< arr.length; j++) {
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
	
	public void selectionSort(int[] arr) {
		
		
		for (int i=0; i< arr.length - 1; i++) {
			int minIndex = i;
			
			for(int j = i+1 ; j< arr.length ; j++) {
				
				if(arr[j] < arr [minIndex]) {
					minIndex = j;
				}
			}
			
			//swap values of smallest value of array with the min index
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
