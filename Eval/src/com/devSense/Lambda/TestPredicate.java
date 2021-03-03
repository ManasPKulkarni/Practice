package com.devSense.Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dog> dlist = new ArrayList<>();
		Dog boi = new Dog("boi", 9, 15);
		Dog clover = new Dog("clover",8,14);
		Dog aiko = new Dog("aiko",10, 18);
		Dog zooey = new Dog("zooey", 10, 20);
		Dog chris = new Dog("chris", 8, 15);
		
		dlist.add(boi); dlist.add(aiko);dlist.add(clover);dlist.add(zooey);dlist.add(chris);
		
		System.out.println("----------All Dogs in the list ----------");
		dlist.forEach(d -> System.out.println(d));
		
		System.out.println("----------Dogs older than 9 years--------");
		printIf(dlist, (d) -> d.getAge() > 9);
		
		System.out.println("----------Dogs upto 9 years of age-------");
		printIf(dlist, (d) -> d.getAge() <= 9);
		
		Predicate<Dog> findC = (d) -> d.getName().startsWith("c");
		dlist.removeIf(findC);
		System.out.println("--------List of Dogs with name not starting from c----");
		dlist.forEach(d -> System.out.println(d));
		
		System.out.println("--------Predicate Name and Age----");
		Predicate<Dog> name = d -> d.getName().startsWith("b");
		Predicate<Dog> Age = d -> d.getAge() >= 9;
		Predicate<Dog> nameAndAge = name.and(Age);
		System.out.println(nameAndAge.test(boi));
	}
	
public static void printIf(ArrayList<Dog> dlist, Predicate<Dog> p) {
	for (Dog dog : dlist) {
		if(p.test(dog)) {
			System.out.println(dog);
		}
	}
}

}
