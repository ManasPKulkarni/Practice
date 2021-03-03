package com.devSense.InnerClasses;

public class Car {
	
	class Engine{
		//
//		Engine(){
//			Car.this.drive();
//		}
		{Car.this.drive();}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Car().go();
	}
	
	public void go() {
		new Engine();
	}

	void drive() {
		System.out.println("hi");
	}
}
