package com.devSense.misc;

public class Animal {
	
	public void eat() throws Exception{
		
	}

}

class Dog2 extends Animal{
	
	@Override
	public void eat() {
		
	}
	
	public static void main(String [] args) {
		Animal a = new Dog2();
		Dog2 d = new Dog2();
		
		d.eat();
//		a.eat();
		/*Add the throws exception cluase on the overridden method in Dog2 class as
		 * the supertype method has already thrown an exception*/
	}
}
