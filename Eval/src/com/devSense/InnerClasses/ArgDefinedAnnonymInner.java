package com.devSense.InnerClasses;

public class ArgDefinedAnnonymInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArgDefinedAnnonymInner a = new ArgDefinedAnnonymInner();
		a.go();
	}
	
//	void go() {
//		Bar b = new Bar();
//		b.doStuff(new Foo() {
//			public void foof() {
//				System.out.println("Inside foof method from interface Foo");
//			}
//		});
//	}

	/*Using lambda expressions above function go looks like */
	
	void go() {
		Bar b = new Bar();
		b.doStuff(() -> System.out.println("Inside foof method from interface Foo"));
	}
}

interface Foo{
	public void foof();
}
class Bar{
	void doStuff(Foo f) {
		f.foof();
	}
}
