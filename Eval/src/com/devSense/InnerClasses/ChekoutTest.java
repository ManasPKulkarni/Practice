package com.devSense.InnerClasses;

public class ChekoutTest implements Checkout{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Checkout Main");
		
		ChekoutTest n = new ChekoutTest();
		n.check();
		Checkout.checkStatMethod();
		
	}
	
	

}
