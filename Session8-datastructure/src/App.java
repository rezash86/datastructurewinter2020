import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tasks.Employee;
import tasks.Office;
import tasks.Task2;

public class App {

//	public static void main(String[] args) {
//		Task2 task = new Task2();
//		//task.findUniqueNumbers(new int[] { 1, 2, 2, 3, 4, 5, 6, 6, 6, 6 });
//
////		System.out.print(task.containAllVowels("abcdefgiou"));
//
//		Map<Integer, Employee> map1 = new HashMap<Integer, Employee>();
//
//		Map<Employee, List<Office>> map2 = new HashMap<Employee, List<Office>>();
//
//		Map<Integer, Employee> synchronizedMap1 = Collections.synchronizedMap(map1);
//
//		map1.put(1, new Employee(1, "A", 1000d, (short)15));
//		map1.put(2, new Employee(2, "B"));
//		map1.put(3, new Employee(3, "C"));
//		map1.put(4, new Employee(4, "D"));
//		
//		// boolean check if the key exists
//		Integer k = 1;
//		boolean containsKey = synchronizedMap1.containsKey(k);
//		System.out.println("it contains " + k + " ?"  + containsKey);
//		// return set of keys
//		System.out.println("Have the set of keys");
//
//		Set<Integer> keySet = synchronizedMap1.keySet();
//		keySet.forEach(key -> System.out.println(key));
//		// return value
//		System.out.println("Fetch employee by key");
//		Employee employee = synchronizedMap1.get(1);
//		System.out.println(employee.toString());
//
//		System.out.println("way 1");
//		for (Map.Entry<Integer, Employee> entry : map1.entrySet())
//			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
//
//		System.out.println("way 2");
//		
//		map1.entrySet().stream()
//				.forEach(entry -> 
//				System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue()));
//		
//		System.out.println("way 3");
//		
//		map1.forEach((keeeey,vaaaalue) -> System.out.println("Key = "
//                + keeeey + ", Value = " + vaaaalue)); 
//	
//	}
	
	public static void main(String[] args) {
		Task2 t = new Task2();
		Map<String, Integer> findOccurance = t.findOccurance("cat dog duck dog cat leo di "
				+ "caperio tom willis hanks Bruce hanks willis dog cat");
		
		findOccurance.forEach((k,v) ->
				System.out.println(" word = " + k + 
				" occurance count =" + v));
	}

}
