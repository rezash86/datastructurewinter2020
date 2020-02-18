package tasks;

public class Employee implements Comparable<Employee>{
	
	private Integer id;
	private String name;
	private Double salary;
	private Short age;
	
	public Employee(Integer id, String name, Double salary, Short age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.getAge().compareTo(o.getAge());
	}
	
	
}
