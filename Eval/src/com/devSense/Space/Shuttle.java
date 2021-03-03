package com.devSense.Space;

public class Shuttle extends Rocket{

	public static void main(String [] args) {
		new Shuttle().go();
	}
	
	void go() {
		blastoff();
		Rocket r = new Rocket();
		r.blastoff();
	}
	
	void blastoff() {
		System.out.println("Bang on ...");
	}
}
