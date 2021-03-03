package com.devSense.InnerClasses;

public interface Checkout {

	default public void check() {
		System.out.println("Inside default method in interface");
	}
	
	static public void checkStatMethod() {
		System.out.println("Inside a static method");
	}
}
