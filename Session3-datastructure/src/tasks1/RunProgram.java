package tasks1;

public class RunProgram {

	public static void main(String[] args) {
//		Task3 task = new Task3();

		// int[] arr = new int[10];
		// int arr[] = new int[10];
//		int[] array = new int[] { 1,2,3,4,5,6,7,8};
				
//		task.removedDuplicates(array);
//		int[] removedDuplicates = task.removedDuplicates(array);
		
//		for (int i = 0; i < removedDuplicates.length; i++) {
//			System.out.print(removedDuplicates[i] + " ");
//		}
		
		//int[] reverseWithTempArray = task.reverseWithTempArray(array);
//		int[] reverseWithOutTempArray = task.reverseWithoutTempArray(array);
//		
//		for (int i = 0; i < reverseWithOutTempArray.length; i++) {
//			System.out.print(reverseWithOutTempArray[i] + "  ");
//		}
		
		Task4 task = new Task4();
		Employee[] emps = task.fillArray();
		
		task.showEmployees(emps);
	}
	
}
