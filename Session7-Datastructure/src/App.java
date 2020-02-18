import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tasks.Employee;
import tasks.RezaStack;
import tasks.SalaryCompartor;
import tasks.Task1;

public class App {
//	public static void main(String[] args) {
//
//		int[] arr = new int[] { 10, 20, 30, 40, 50, 60 };
//		
//		Task1.reversArray(arr);
//		
//		RezaStack<String> stack = new RezaStack<String>();
//		stack.push("ttt");
//		
//		char[] chArr = new char[] {'a','b','c','d','e'};
//		Task1.createSpecialString(chArr);
//	}
	
	
	public static void main(String...argsssss) {
		Employee emp1 = new Employee(1, "A1", 1000d, (short)12);
		Employee emp2 = new Employee(2, "A2", 2000d, (short)22);
		Employee emp3 = new Employee(3, "A3", 3000d, (short)32);
		Employee emp4 = new Employee(4, "A4", 4000d, (short)42);
		Employee emp5 = new Employee(5, "A5", 5000d, (short)52);
		
		List<Employee> listEmployees = new ArrayList<Employee>();
		listEmployees.add(emp1);
		listEmployees.add(emp4);
		listEmployees.add(emp3);
		listEmployees.add(emp2);
		listEmployees.add(emp5);
		
		listEmployees.stream().
		forEach(emp -> System.out.println(emp));
		
		System.out.println("after sort");
		
		//Collections.sort(listEmployees);
		Collections.sort(listEmployees, new SalaryCompartor());
		
		listEmployees.stream().
			forEach(emp -> System.out.println(emp));
	}
	
}
