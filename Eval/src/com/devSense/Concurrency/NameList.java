package com.devSense.Concurrency;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NameList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameList n1 = new NameList();
		n1.add("Hare Rama");
		class NameDropper extends Thread{
			public void run() {
				String nam = n1.removeFirst();
				System.out.println(nam);
			}
		}
		
		Thread t1 = new NameDropper();
		Thread t2 = new NameDropper();
		
		try {
			t1.start();
			t2.start();	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static List<String> names = Collections.synchronizedList(new LinkedList<>());
	
	public synchronized void add(String name) {
		names.add(name);
	}
	
	public synchronized String removeFirst() {
		if(names.size()>0) {
			return names.remove(0);
		}
		else
			return null;
	}
}
