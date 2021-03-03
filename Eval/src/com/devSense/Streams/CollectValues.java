package com.devSense.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person beth = new Person(30, "Beth D");
		Person eric = new Person(31, "Eric");
		Person deb = new Person(31, "Deb W.");
		Person liz = new Person(30, "Liz G.");
		Person wendi = new Person(34, "Wendi");
		Person kathy = new Person(35, "Kathy");
		Person bert = new Person(32, "Bert");
		Person bill = new Person(34, "Bill");
		Person robert = new Person(38, "Robert D.");
		
		List<Person> people = new ArrayList();
		people.add(robert);people.add(bert);
		people.add(wendi);people.add(deb);
		people.add(eric);people.add(beth);
		people.add(bill);people.add(kathy);
		people.add(liz);

//		List<Person> people_34
//		= people.stream()
//		.filter(p->p.getAge() ==34)
//		.collect(Collectors.toList());
		
//		List<Person> people_34
//		= people.stream()
//		.filter(p->p.getAge() ==34)
//		.collect(Collectors.toCollection(ArrayList::new));
		
//		List<Person> people_34
//		=	people.stream()
//			.filter(p-> p.getAge() ==34)
//			.collect(Collectors.toCollection(()-> new ArrayList<Person>()));
//		
//		System.out.println("People Aged 34 : " + people_34);
		
		
//		long count1 = people.stream()
//				.filter(p-> p.getAge() ==34)
//				.count();
		
		
		people.stream().collect(Collectors.groupingBy(p -> p.getAge()))
		.forEach((c, p1) -> {
			System.out.print("People who are "+ c + " : ");
			p1.forEach(p -> System.out.print(p.getName() + "  "));
			System.out.println();
		});
	}

}


