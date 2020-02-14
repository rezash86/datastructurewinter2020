package user;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.stream.Collectors;

import domain.Student;

public class ServiceUser {
	
	public void getGrade() {
		
		List<Integer> grades = new ArrayList<Integer>();
		
		//for adding a new entity
		//grades.add(object)
		
		
		//add another collection into an arraylist
		//grades.addAll([object])
		
		//check if that object exists in the collection
		//grades.contains(object);
		
		//to fetch an element in the arraylist
		//grades.get(index)
		
		//takes the index of that object
		//grades.indexOf(object)
		
		
		
		
		
		
		
		
		
		//foreach
		grades.stream().forEach(n -> System.out.println(n));
		
		grades.stream().forEach(num ->{
			num = num +2;
			System.out.println(num);
		});
		
		//filter for finding one element
		Optional<Integer> result = grades.
				stream().filter(num -> num > 10).findFirst();
		
		if(result.isPresent()) {
			int res = result.get();
		}
		
		grades.stream().filter(num -> num > 20).
			findFirst().ifPresent(n-> System.out.println(n));
		
		//filter for finding a list
		List<Integer> numbersList = grades.stream().
				filter(num -> num > 10).collect(Collectors.toList());
		
		
		List<Student> students = new ArrayList<Student>();
		//Taking the names of the students
		List<String> namesOfStudents = students.stream().
				map(toto -> toto.getName()).sorted().collect(Collectors.toList());
		
	}
}
