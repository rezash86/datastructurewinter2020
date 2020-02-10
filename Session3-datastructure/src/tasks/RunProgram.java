package tasks;

public class RunProgram {

	public static void main(String[] args) {
		Tasks task = new Tasks();

		// int[] arr = new int[10];
		// int arr[] = new int[10];
		int[] array1 = new int[] { 10, 12, 15, 8, 6 };
		int[] array2 = new int[] { 10 };
		int[] array3 = new int[] {};

		
		int largestIndex1 = task.findLargestIndex(array1);
		int largestIndex2 = task.findLargestIndex(array2);
		int largestIndex3 = task.findLargestIndex(array3);

		if(largestIndex1 != -1) {
			System.out.println("the largest is =" + array1[largestIndex1]);
		}
		
		if(largestIndex2 != -1) {
			System.out.println("the largest is =" + array2[largestIndex2]);
		}
		
		if(largestIndex3 != -1) {
			System.out.println("the largest is =" + array3[largestIndex3]);
		}
		else {
			System.out.println("there is no element");
		}
		
		
		
		
		int samllestIndex1 = task.findSmallestIndex(array1);
		int samllestIndex2 = task.findSmallestIndex(array2);
		int samllestIndex3 = task.findSmallestIndex(array3);
		
		if(samllestIndex1 != -1) {
			System.out.println("the smallest is =" + array1[samllestIndex1]);
		}
		else {
			System.out.println("there is no element");
		}
		
		if(samllestIndex2 != -1) {
			System.out.println("the smallest is =" + array2[samllestIndex2]);
		}
		else {
			System.out.println("there is no element");
		}
		
		
		
		if(samllestIndex3 != -1) {
			System.out.println("the smallest is =" + array3[samllestIndex3]);
		}
		else {
			System.out.println("there is no element");
		}
	}
}
