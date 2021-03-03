package com.devSense.baseString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//class Dog {
//	String name;
//	Dog(String n){
//		name =n;
//	}
//}


public class ItTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dog> d = new ArrayList<Dog>();
		Dog dog = new Dog("Aiko");
		d.add(dog);
		d.add(new Dog("Clover"));
		d.add(new Dog("Magnolia"));
		
		Iterator<Dog> it = d.iterator();
		while(it.hasNext())
		{
			Dog d2 = it.next();
			System.out.println("Iterating through new Dog object : " +  d2.name);
		}
		
		System.out.println("size: " +  d.size());
		System.out.println("get 1: " + d.get(1).name);
		System.out.println("Aiko : " + d.indexOf(dog));
		
		d.remove(dog);
		
		Object [] oArr = d.toArray();
		for (Object object : oArr) {
			Dog d3 = (Dog) object;
			System.out.println("Object : "+ d3.name);
		}
		
		
	}

}
