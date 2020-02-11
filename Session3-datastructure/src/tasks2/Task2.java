package tasks2;

public class Task2 {
	
	public Student[] countCorrectAnswers(char[][] answers, char[] key) {
		
		//count of students
		int[] result = new int[answers.length];
		
		Student[] studentResults = new Student[answers.length];
		
		for (int i=0; i< answers.length; i++) {
			int counter = 0;
			for (int j=0; j< answers[i].length; j++) {
				if (answers[i][j]==key[j]) {
					counter++;
				}
				
			}
			result[i] = counter;
			studentResults[i] = new Student();
			studentResults[i].setName("Student number " + (i + 1));
			studentResults[i].setGrade(counter);
		}
		
		
		//return result;
		return studentResults;
	}
}
