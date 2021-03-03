package com.devSense.Patterns.Strategy;

public class Duck {
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public Duck() {
		
	}
	
	public void PerformQuack() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All Ducks float ! even decoys do!");
	}
	
	public void display() {
		
	}
	
	public void PerformFly() {
		flyBehaviour.fly();
	}
	
	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}

}
