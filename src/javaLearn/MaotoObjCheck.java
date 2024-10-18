package javaLearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	long salary;
	long numb;

	public Employee(int id, String name, long salary, long numb) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.numb = numb;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	

}

public class MaotoObjCheck {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Adi", 1111111111, 1234567890);
		Employee e2 = new Employee(2, "di", 2111111111, 234567890);
		Employee e3 = new Employee(3, "cdi", 511111111, 34567890);
		Employee e4 = new Employee(4, "bdi", 311111111, 34567890);
		Employee e5 = new Employee(5, "hdi", 177111111, 34567890);
//		
//		List<Employee> empList2 = 	Arrays.asList(e1,e2,e3,e4,e5);
		List<Employee> empList = List.of(e1, e2, e3, e4, e5);
		
		Map<Integer,String> mp = empList.stream().collect(Collectors.toMap(Employee::getId ,Employee::getName ));
		System.out.println(mp);

	}

}
