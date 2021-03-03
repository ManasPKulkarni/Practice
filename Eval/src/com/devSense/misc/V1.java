package com.devSense.misc;


abstract class V2 {

	public abstract int add(int a, int b);
	
	public void PrintMyName() {
		System.out.println("Hello there from abstract class");
	}

}

class ImplSample extends V2 {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
//	public void PrintMyName() {
//		System.out.println("Hello there from ImpleSample");
//	}
//	
}

public class V1{
	
	public static void main(String []args) {
		System.out.println("Hello From Main");
		
		ImplSample imp = new ImplSample();
		int c = imp.add(10, 20);
		System.out.println(c);
		
		imp.PrintMyName();
	}
}
