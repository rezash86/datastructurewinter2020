import tasks.Task2;

public class App {
	
	public static void main(String[] args) {
		Task2 task = new Task2();
		task.findUniqueNumbers(new int[] {1,2,2,3,4,5,6,6,6,6});
		
		System.out.print(task.containAllVowels("abcdefgiou"));
	}
	
}
