package com.devSense.Digital;

class Tablet extends Electronic implements Gadget{

	@Override
	public void doStuff() {				//comment public to see the visibility issue of a method
		// TODO Auto-generated method stub
		System.out.println("Show Stuff");
	}
	
	public static void main(String [] args) {
		new Tablet().getPower();
		new Tablet().doStuff();
	}

}
