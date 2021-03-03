package com.devSense.demo;

public class First {
	public static void main (String []args) {
		System.out.println("Hello!");
		
		Deer d = new Deer();
		Animal a = d;
		Vegetarian v = d;
		Object o = d;
		
		System.out.println(a.getClass().getName());
		System.out.println(v.getClass().getName());
		System.out.println(o.getClass().getName());
		System.out.println(d.getClass().getName());
		
	}
	
}

 interface Vegetarian{}
 class Animal{}
 class Deer extends Animal implements Vegetarian{
	 Deer(){
		 System.out.println("I am a deer");
	 }
 }
 
 