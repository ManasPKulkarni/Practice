package com.devSense.misc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> mySet = new HashSet<Employee>();
		
		Employee e1 = new Employee(1,"manas");
		Employee e2 = new Employee(2,"deepak");
		Employee e3 = new Employee(2,"deepak");
		
		mySet.add(e2);
		mySet.add(e1);
		mySet.add(e3);
	
		
		Iterator<Employee> iter = mySet.iterator();
		
		while (iter.hasNext()) {
			Employee employee = (Employee) iter.next();
			System.out.println(employee.toString());
			
		}
		
		System.out.println(mySet.contains(e3));
		
		Developer d1 = new Developer(1, "manas", 5);
		d1.getSomething(1.0, 2.0);
		d1.getSomething(1, 3);
		e1.getSomething(4, 5);
	}

}
