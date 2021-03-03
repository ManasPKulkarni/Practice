package com.devSense.Streams;

class Dog implements Comparable<Dog>{
	private String name;
	private int age;
	private int weight;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
//	@Override
//	public String toString() {
//		return "Dog [name=" + name + "]";
//	}

	@Override
	public String toString() {
		return this.name + " is " + this.age + " years old and weigh " + this.weight;
	}
	
	public String getName() {
		return name;
	}
	public Dog(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}
	public int getWeight() {
		return weight;
	}
	
	
	public void bark() {
		System.out.println("woof Woof !!!");
	}
	@Override
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
}