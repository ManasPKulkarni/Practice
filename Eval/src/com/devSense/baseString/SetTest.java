package com.devSense.baseString;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] ba = new boolean[5];
		Set s = new HashSet();
		//Set s = new TreeSet();
		
		ba[0] = s.add("a");
		ba[1] = s.add(new Integer(42));
		ba[2] = s.add("b");
		ba[3] = s.add("a");
		ba[4] = s.add(new Object());
		
		for (int i = 0; i < ba.length; i++) {
			System.out.print(ba[i] + " ");
		}
		System.out.println();
		for (Object object : s) {
			System.out.print(object + " ");
		}

	}

}
