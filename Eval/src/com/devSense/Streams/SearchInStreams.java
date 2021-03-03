package com.devSense.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SearchInStreams {

	public static void main(String []args) {
		
		List<Dog> doglist = new ArrayList<>();
		
		Dog boi = new Dog("boi",9,30);
		Dog clover = new Dog("clover",10,40);
		Dog aiko = new Dog("aiko",7,25);
		Dog zooey = new Dog("zooey",1,5);
		Dog charles = new Dog("charles", 14, 50);
		
		doglist.add(boi);
		doglist.add(aiko); //doglist.add(clover);
		doglist.add(zooey);doglist.add(charles);
		
		boolean cName_25=
		doglist.stream()
		.noneMatch(d-> d.getName().equals("red"));
//		.filter(d-> d.getAge()>5)
//		.filter(d-> d.getWeight()>25)
//		.anyMatch(d-> d.getName().startsWith("c"))
		/*above are for anyMatch */
		
//		.allMatch(d-> d.getAge()>5) //or 
//		.mapToInt(d-> d.getAge())
//		.allMatch(a-> a >5);
		/*above are for allMatch */
		
		
		
//		System.out.println("Are there any dogs weighing more than 25 kg and names starting with \"C\" : " + cName_25);
		
//		System.out.println("Are all dogs out there are more than 5 years old ? " + cName_25);
		
		System.out.println("None of dogs with name as red ? " + cName_25);
		
		
		/*Search to find and return the object*/
		/*------------------------------------------------------------------------------------------*/
		
		Optional<Dog> dogOpt = 
				doglist.stream()
				.filter(d-> d.getAge()>5)
				.filter(d-> d.getWeight()>25)
				.filter(d-> d.getName().startsWith("c"))
				.findFirst();
		
		dogOpt.ifPresent(System.out::println);
	}
}
