package tasks;

public class Task4 {
	
	public Employee[] fillArray() {
		Employee[] empArr = new Employee[5];
		empArr[0] = new Employee("emp1", 1000);
		empArr[1] = new Employee("emp2", 2000);
		empArr[2] = new Employee("emp3", 3000);
		empArr[3] = new Employee("emp4", 4000);
		empArr[4] = new Employee("emp5", 5000);
		
		
		return empArr;
	}
	
	public void showEmployees(Employee[] empArr) {
		for (int i = 0; i < empArr.length; i++) {
			System.out.println(empArr[i]);
		}
	}
}
