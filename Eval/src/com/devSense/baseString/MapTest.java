package com.devSense.baseString;

import java.util.HashMap;
import java.util.Map;

class Dog{
	String name;
	
	Dog(String n){
		name = n;
	}
	
	public boolean equals(Object o) {
		if((o instanceof Dog) && (((Dog)o).name == name)) {
			return true;
		}
		else
			return false;
		
	}
	
	public int hashCode() {
		return name.length();
	}
}

class Cat{
	
}

enum Pets{
	DOG, CAT, HORSE;
}

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Object, Object> myMap = new HashMap<>();
		myMap.put("k1", new Dog("Aiko"));
		myMap.put("k2", Pets.DOG);
		myMap.put(Pets.CAT, "CAT Key");
		Dog d1 = new Dog("Milo");
		myMap.put(d1, "Dog Key");
		myMap.put(new Dog("Bokoooo"), "Dogoooo Key");
		myMap.put(new Cat(), "Cat Key");
		
		System.out.println(myMap.get("k1"));
		String k1 = "k1";
		System.out.println(myMap.get(k1));
		String k2 = "k2";
		System.out.println(myMap.get(k2));
		Pets p = Pets.CAT;
		System.out.println(myMap.get(p));
		System.out.println(myMap.get(Pets.CAT));
		
		System.out.println(myMap.get(d1));
		
		System.out.println(myMap.get(new Cat()));

		System.out.println(myMap.get(new Dog("Bokoooo")));
		
		System.out.println(myMap.size());
	}

}
