package com.devSense.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Doggy {
	private int age;
	private String name;
	private int weight;

	public Doggy(int age, String name, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString() {
		return this.name;
	}

	public void bark() {
		System.out.print("Woof!"+ "\n");
	}
}

public class UseofandThen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Doggy> dogList = new ArrayList<Doggy>();
		Doggy boi = new Doggy(10, "boi", 20);
		Doggy zoi = new Doggy(9, "zoi", 22);
		Doggy clover = new Doggy(10, "clover", 13);

		dogList.add(boi);
		dogList.add(zoi);
		dogList.add(clover);

		Consumer<Doggy> displayName = (d) -> System.out.print(d+ " ");
		dogList.forEach(displayName.andThen(d -> d.bark()));

	}

}
