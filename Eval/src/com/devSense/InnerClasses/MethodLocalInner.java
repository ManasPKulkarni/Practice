package com.devSense.InnerClasses;

public class MethodLocalInner {

	public static void main(String [] args) {
//		System.out.println("Inside Method Local Inner class demo");
		MyOuter2 outer2 = new MyOuter2();
		outer2.doStuff();
	}
}

class MyOuter2{
	
	private int y = 9;
	
	public void doStuff() {
		System.out.println("Inside Myouter2 class method doStuff ");
		final String z = "Local variable to method doStuff()";
		
		final class MyInner2{
			public void seeOuter2() {
				System.out.println("private variable y from MyOuter class has value: " + y);
				System.out.println("Local Variable from the method: " + z);
//				z = "Changing Local variable";
			}
		}
		y = 10;
		
		MyInner2 inner2 = new MyInner2();
		inner2.seeOuter2();
	}
	
}
