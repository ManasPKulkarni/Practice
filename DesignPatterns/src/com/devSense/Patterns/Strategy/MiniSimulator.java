package com.devSense.Patterns.Strategy;

public class MiniSimulator {
	
	/*	The Strategy Pattern defines a family of algorithms,
		encapsulates each one, and makes them interchangeable.
		Strategy lets the algorithm vary independently from
		clients that use it.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.PerformFly();
		mallard.PerformQuack();
		
		System.out.println("-------------------------------------------------------------");
		
		Duck model = new ModelDuck();
		model.PerformFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.PerformFly();
		
		System.out.println("-------------------------------------------------------------");
	}

}
