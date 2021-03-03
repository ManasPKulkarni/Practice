package com.devSense.misc;

public class Version5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Main");
		Version5 v5 = new Version5();
		int f = v5.add(4, 5);
		V6  v6 = new V6();
		v6.getOut();
		System.out.println(f);
		
	}

	public static int add (int a, int b)
	{
		return a+b;
	}
}

class V6 extends Version5{
//	V6 v6 = new V6();
	public void getOut() {
		System.out.println("Get Out!");
	}
}
