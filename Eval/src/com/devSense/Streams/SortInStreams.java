package com.devSense.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortInStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stream.of("Jerry", "George", "Tom", "Mowgli").sorted().forEach(System.out::println);
		
		List<Dog> doglist = new ArrayList<>();
		Dog boi = new Dog("boi",9,30);
		Dog clover = new Dog("clover",10,40);
		Dog aiko = new Dog("aiko",7,32);
		Dog zooey = new Dog("zooey",1,5);
		Dog charles = new Dog("charles", 14, 50);
		
		Dog boi1 = new Dog("boi",12,35);
		Dog clover1 = new Dog("clover",6,30);
		Dog aiko1 = new Dog("aiko",9,45);
		Dog zooey1 = new Dog("zooey",11,55);
		Dog charles1 = new Dog("charles", 4, 15);
		
		Dog boi2 = new Dog("boi",12,35);
		Dog clover2 = new Dog("clover",6,30);
		
		doglist.add(boi);
		doglist.add(aiko); doglist.add(clover);
		doglist.add(zooey);doglist.add(charles);
		doglist.add(boi1);
		doglist.add(aiko1); doglist.add(clover1);
		doglist.add(zooey1);doglist.add(charles1);
		
		doglist.add(boi2);doglist.add(clover2);
		
//		doglist.stream()
//		.sorted()
//		.forEach(System.out::println);
		
//		System.out.println("---------------------------------------------------------------------------");
//		doglist.stream()
//		.sorted((d1,d2)-> d1.getAge()-d2.getAge())
//		.forEach(System.out::println);
		
//		Comparator<Dog> compbyWeight = (d1, d2) -> d1.getWeight()-d2.getWeight();
//		System.out.println("---------------------------------------------------------------------------");
//		doglist.stream()
//		.sorted(compbyWeight)
//		.forEach(System.out::println);
		
		
		Comparator<Dog> byWeight = Comparator.comparing(Dog::getWeight);
		Comparator<Dog> byAge = Comparator.comparing(Dog::getAge);
		Comparator<Dog> byName = Comparator.comparing(Dog::getName);
		
//		doglist.stream().sorted(byName).forEach(System.out::println);
//		System.out.println("---------------------------------------------------------------------------");
//		doglist.stream().sorted(byName.reversed()).forEach(System.out::println);
		
//		doglist.stream().sorted(byName).forEach(System.out::println);
//		System.out.println("---------------------------------------------------------------------------");
//		doglist.stream().map(d->d.getName()).distinct() .forEach(System.out::println);
		
//		doglist.stream().map(d->d.getName()).distinct() .forEach(n->System.out.print(n + "  "));
//		System.out.println();
//		List<Dog> heavyDogs =
				/*doglist.stream()
				.filter(d->d.getWeight()>40)
				.forEach(System.out::println);*/
				
				List<Dog> heavyDogs =
						doglist.stream()
						.filter(d->d.getWeight()>40)
						.collect(Collectors.toList());
				
				
				System.out.println(heavyDogs.toString());
//				heavyDogs.forEach(n-> System.out.print(n + "  "));
				
//				doglist.stream().distinct()
//				.sorted(byName.thenComparing(byWeight)).forEach(System.out::println);
	}

}
