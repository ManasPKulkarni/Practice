package com.devSense.misc;

public class Developer extends Employee {

	private int tech;
	
	public Developer(int id, String name, int tech) {
		super(id, name);
		this.tech = tech;
	}

	public int getTech() {
		return tech;
	}

	public void setTech(int tech) {
		this.tech = tech;
	}

	public Developer(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	/*@Override
	public void getSomething(int a, int b) {
		System.out.println("Inside Developer - Overridden");
	}*/

	public void getSomething(double a, double b) {
		System.out.println("Inside Developer - Overloaded");
	}
}
