package tasks;

import java.util.Comparator;

public class SalaryCompartor implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary().compareTo(o2.getSalary());
	}

}
