package com.devSense.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GeoCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s = {"map","pen","marble","key"};
		Othello o = new Othello();
		Arrays.sort(s,o);
		
		for(String s2:s) {
			System.out.print(s2 + " ");
		}
		System.out.println(Arrays.binarySearch(s, "map",o));
		
		ArrayList<String> arL = new ArrayList<>();
		arL.sort(o);
	}

	static class Othello implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
		
	}
}
