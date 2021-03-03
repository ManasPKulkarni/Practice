package com.devSense.Patterns.Strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
	}
	
	public void display() {
		System.out.println("I am Model Duck! ");
	}
}
