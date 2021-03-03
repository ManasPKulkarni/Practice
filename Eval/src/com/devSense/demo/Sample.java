package com.devSense.demo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Execution completed");
		
//		ArrayList<Number> input = null;
//		List<Number> output = null;
//		
//		output = process(input);
		
//		PriorityQueue<String> pq = new PriorityQueue<>();
//		pq.add("2");
//		pq.add("4");
//		System.out.print(pq.peek() + " ");
//		pq.offer("1");
//		//System.out.print(pq.peek() + " ");
//		pq.add("3");
//		pq.remove("1");
//		//System.out.print(pq.peek() + " ");
//		System.out.print(pq.poll() + " ");
//		if(pq.remove("2"))System.out.println(pq.poll() + " ");
//		System.out.println(pq.poll() + " " + pq.peek());
		
		
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.add("2");
		ad.add("4");
		System.out.print(ad.peek()+ " ");
		ad.offer("1");
		ad.add("3");
		ad.remove();
		System.out.print(ad.poll() + " ");
		if(ad.peek().equals("2"))System.out.println(ad.poll() + " ");
		System.out.println(ad.poll()+ " " + ad.peek());
		
		System.out.println("\n");
		Iterator it = ad.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}
	
//	public static <E extends Number> List<E> process (List<E> nums){
//		
//		return nums;
//		
//	}
	
	
	

}
