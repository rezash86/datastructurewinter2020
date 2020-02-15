package user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import domain.Employee;

public class EmployeService {

	public void employeeFunction() {

		// Convert Array into list and addAll the collection
		String[] cities = new String[] { "Montreal", "Toronto", "winnipeg" };
		List<String> convertedListCities = java.util.Arrays.asList(cities);
		List<String> listCities = new ArrayList<String>();
		listCities.addAll(convertedListCities);

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1, "A", 10000d));
		employeeList.add(new Employee(2, "B", 5000d));
		employeeList.add(new Employee(3, "C", 20000d));
		employeeList.add(new Employee(4, "D", 300000d));
		employeeList.add(new Employee(5, "E", 100d));

//		List<Employee> employeeWithHighSalary = employeeList.stream().filter
//			(emp -> emp.getSalary() > 10000).collect(Collectors.toList());

		employeeList.stream().filter(emp -> emp.getSalary() > 50000).forEach(emp -> {
			System.out.println(emp.getName());
		});

		System.out.println("employee with high salary");
		employeeList.stream().filter(emp -> emp.getSalary() > 50000).findAny()
				.ifPresent(e -> System.out.println(e.getName()));

		System.out.print("name of the employee");
		employeeList.stream().map(empl -> empl.getName()).sorted().forEach(name -> System.out.println(name));

		Optional<Employee> founded = employeeList.stream().filter(emp -> emp.getName().equals("Reza")).findAny();
		if (founded.isPresent()) {
			Employee employee = founded.get();
		}

		// CTRL + 2 (a pause) + L
		int[] nums = { 10, 20, 30, 40 };
		
		
		Arrays.stream(nums).forEach(c->System.out.print(c + "  "));
		
		Arrays.stream(nums).boxed().collect(Collectors.toList()).
			forEach(c->System.out.print(c + "  "));
		
		List<Integer> convertedList = Arrays.stream(nums).boxed().collect(Collectors.toList());
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int n : nums) {
			numbers.add(n);
		}

		List<Integer> collect = numbers.stream().map(num -> num * 2).
				collect(Collectors.toList());
		
		collect.forEach(c->System.out.print(c + "  "));

	}
}
