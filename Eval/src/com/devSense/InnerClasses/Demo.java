package com.devSense.InnerClasses;

public class Demo {
	
	public static void main(String [] args) {
		System.out.println("I am inside demo class main for outer and inner class ");
		MyOuter mo = new MyOuter();
		MyOuter.MyInner inner = mo.new MyInner(); 
		inner.seeOuter();
	}
}

class MyOuter{
	
	private int x =7;
	
	public void makeInner() {
		MyInner inner = new MyInner();
		inner.seeOuter();
	}
	class MyInner{
		public void seeOuter() {
			System.out.println("Outer Private variable x has value of: "+ x);
			System.out.println("Inner class Reference is : "+ this);
			System.out.println("Outer class Reference is : "+ MyOuter.this);
		}
	}
}