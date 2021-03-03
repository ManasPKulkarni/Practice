
package com.devSense.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Person beth = new Person(30, "Beth D");
//		Person eric = new Person(31, "Eric");
//		Person deb = new Person(31, "Deb W.");
//		Person liz = new Person(30, "Liz G.");
//		Person wendi = new Person(34, "Wendi");
//		Person kathy = new Person(35, "Kathy");
//		Person bert = new Person(32, "Bert");
//		Person bill = new Person(34, "Bill");
//		Person robert = new Person(38, "Robert D.");
//		
//		List<Person> people = new ArrayList();
//		people.add(robert);people.add(bert);
//		people.add(wendi);people.add(deb);
//		people.add(eric);people.add(beth);
//		people.add(bill);people.add(kathy);
//		people.add(liz);
//		
		List<Person> people = Arrays.asList(new Person(30, "Beth D"),
		new Person(31, "Eric"),
		new Person(31, "Deb W."),
		new Person(30, "Liz G."),
		new Person(34, "Wendi"),
		new Person(35, "Kathy"),
		new Person(32, "Bert"),
		new Person(34, "Bill"),
		new Person(38, "Robert D."),
		new Person(45, "Beth D"),
		new Person(38, "Bert"),
		new Person(40, "Bill"));
		
//		Map<Integer, List<Person>> peopleByAge =
//				people.stream().collect(Collectors.groupingBy(Person::getAge));
//		
//		System.out.println("People by Age : " + peopleByAge);
		
		/*	More than on reductions grouping the person by age and instead of displaying the person we are interested in count of person
		 * 	in that age band*/
		
//		Map<Integer, Long> numOfpeoplebyAge =
//				people.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
//		System.out.println("Number of People grouped by age: "+ numOfpeoplebyAge );
//		
//		Map<Integer, List<String>> namesByAge =
//				people.stream().
//				collect(Collectors.groupingBy
//						(Person::getAge,
//						Collectors.mapping
//						(Person::getName, Collectors.toList())));
//		
//		System.out.println("Names of people by Age : "+ namesByAge);
		
		/*Get sum of ages for persons whose names start with B*/
//		Map<String, Integer> sumOfAges_B =
//				people.stream()
//				.filter(p->p.getName().startsWith("B"))
//				.collect(Collectors.groupingBy(Person::getName, 
//						Collectors.summingInt(Person::getAge)));
//		
//		System.out.println("People by Sum of Age: "+ sumOfAges_B); 
		
		
		/*Get Average of ages for persons whose names start with B*/
//		Map<String, Double> AvgOfAges_B =
//				people.stream()
//				.filter(p->p.getName().startsWith("B"))
//				.collect(Collectors.groupingBy(Person::getName, 
//						Collectors.averagingInt(Person::getAge)));
//		
//		System.out.println("People by Sum of Age: "+ AvgOfAges_B); 
		
		/*Counting the number of elements in stream*/
//		Long n = people.stream().collect(Collectors.counting());
//		System.out.println("Total Number of people are : " + n);
		
		/*Counting and Joining*/
		
//		String older_34 
//			= people.stream()
//				.filter(p->p.getAge()>34)
//				.map(Person::getName)
//				.collect(Collectors.joining(", "));
//		
//		System.out.println("People older than 34 years : "+ older_34);
//		
		
		/*Find the oldest person*/
		
		Optional<Person> oldest =
				people.stream()
				.collect(Collectors.maxBy((p1,p2)-> p1.getAge() -p2.getAge()));
		
		oldest.ifPresent(p-> System.out.println("Oldest person on the list " + oldest));
				
	}

}
