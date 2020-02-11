package run;

import tasks2.Student;
import tasks2.Task2;

public class RunProgram {

//	public static void main(String[] args) {
//		Task1 task = new Task1();
//		String[][] arr = {{"blue", "orange", "yellow"}, {"brown"}, {"white", "red"}};
//		
//		String[][] replacedColors = task.replaceColor(arr, "orange", "green");
//		
//		for(int i=0; i< replacedColors.length; i++) {
//			for(int j=0; j<replacedColors[i].length; j++) {
//				System.out.print(replacedColors[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//	
//	}

	public static void main(String[] args) {
		Task2 task = new Task2();
		
		char[] key = {'a', 'b', 'c', 'd'};
//		char[][] answers = new char[][] { 
//				{ 'a', 'c', 'c', 'd' },
//				{ 'a', 'c', 'b', 'a' }, 
//				{ 'c', 'b', 'a', 'a' },
//				{ 'a', 'b', 'a', 'c' } };
			
		char[][] answers = new char[][] { 
			{ 'a', 'c', 'c', 'd' },
			{ 'a', 'c', 'b', 'a' }, 
			{ 'c', 'b', 'a', 'a' },
			{ 'a', 'a', 'a' } };
			
		//int[] countCorrectAnswers = task.countCorrectAnswers(answers, key);
		
//		for (int i = 0; i < countCorrectAnswers.length; i++) {
//			System.out.print(countCorrectAnswers[i] + " ");
//		}
		
		
		Student[] countCorrectAnswers = task.countCorrectAnswers(answers, key);
		for (Student student : countCorrectAnswers) {
			System.out.println(student + " ");
		}
	}
}
