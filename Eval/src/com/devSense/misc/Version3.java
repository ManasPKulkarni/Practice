package com.devSense.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Version3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myList = new ArrayList<String>();
		myList.add("One");
		myList.add("Two");
		myList.add("Three");
		myList.add("Four");
		
		System.out.println("2nd element in the list is : " + myList.get(2));
		
		Set<String> mySet = new HashSet<String>();
		mySet.addAll(myList);
//		mySet.add(null);
		myList.add(null);
		myList.add(null);
		System.out.println(myList);
		
		mySet.add("Element added Last but one");
		mySet.add("Element added Last ");
		System.out.println("2nd element from the set is : " + mySet);
		
	}

}
