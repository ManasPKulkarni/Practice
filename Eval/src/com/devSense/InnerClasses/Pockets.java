package com.devSense.InnerClasses;

import java.util.Arrays;
import java.util.Comparator;

public class Pockets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] sa = {"nickel", "button", "key", "lint"};
		Sorter s = new Sorter();
		for (String string : sa) {
			System.out.print(string + " ");
			}
		Arrays.sort(sa, s);
		System.out.println();
		for (String string1 : sa) {
			System.out.print(string1 + " ");
		}
	}
	
	static class Sorter implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
		
	}

}
