package com.devSense.Lambda;

public class TestDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog boi = new Dog("boi",9,20);
		Dog clover = new Dog("clover",10,25);
		
//		DogQuerier dq =new DogQuerier() {
//			
//			@Override
//			public boolean test(Dog d) {
//				// TODO Auto-generated method stub
//				return d.getAge()>9;
//			}
//		};
		
		/*Sub-part 1*/
		//DogQuerier dq = (d)->d.getAge()>9 ;
//		
//		System.out.println("Is boi older than 9 : "+ dq.test(boi));
//		
//		System.out.println("Is Clover older than 9 : "+ dq.test(clover));
		

		/*Sub-part 2*/
		//DogPlay dp1 = new DogPlay(dq);
		
		DogPlay dp = new DogPlay((d)->d.getAge()>9);
		
		//System.out.println("Is boi older than 9 ? : " + dp1.doQuery(boi));
		
		System.out.println("Is boi older than 9 ? : " + dp.doQuery(boi));
		
		/*Sub-part 3*/
	}

}

class DogPlay{
	
	DogQuerier dq ;
	
	public DogPlay(DogQuerier dogQuerier) {
		this.dq = dogQuerier;
	}
	
	public boolean doQuery(Dog d) {
		return dq.test(d);
	}
}

interface DogQuerier{
	public boolean test(Dog d);
}

class Dog{
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	private int weight;
	
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
	
}
