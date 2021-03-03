package com.devSense.Threads;

public class Reader extends Thread{

	Calculator c; 
	
	public Reader(Calculator calc) {
		c = calc;
	}
	
	public void run() {
		synchronized (c) {
			try {
				System.out.println("Waiting For Calculation ...");
				c.wait(200000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Total is : "+ c.total);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		new Reader(calculator).start();
		new Reader(calculator).start();
		new Reader(calculator).start();
		new Thread(calculator).start();
	}

}

class Calculator implements Runnable{

	int total;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notifyAll();
		}
	}
	
}
