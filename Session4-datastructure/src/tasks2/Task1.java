package tasks2;

public class Task1 {
	
	public String[][] replaceColor(String[][] arr, String from, String to){
		
		// {{"blue", "orange", "yellow"}, {"brown"}, {"white", "red"}}
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j].equals(from)) {
					arr[i][j] = to;
				}
			}
		}
		
		return arr;
		
	}
}
