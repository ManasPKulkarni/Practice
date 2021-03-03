package com.devSense.baseString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SearchObjArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] myArr = {"One","Two","Three","Four"};
		
		//Always Sort before Search
		Arrays.sort(myArr);
		for (String s : myArr) {
			System.out.print(s + " ");
		}

		System.out.println("\nOutput is " + Arrays.binarySearch(myArr,"One"));
		
		System.out.println("Now reversing the sort");
		
		ReSortComparator rsComparator = new ReSortComparator();
		
		Arrays.sort(myArr, rsComparator);
		
		System.out.println("Reversed Output is " );
		for (String s : myArr) {
			System.out.print(s + " ");
		}
		
		System.out.println("\nOutput is " + Arrays.binarySearch(myArr,"One"));
		
		System.out.println("Output is " + Arrays.binarySearch(myArr,"One",rsComparator));
		
		/*Array to List and Vice-versa Conversions*/
		
		List<String> myList = Arrays.asList(myArr);
		System.out.println("Sixe of list : " + myList.size());
		
		System.out.println("Element at Index 2 is : " + myList.get(2));
		
		myList.set(2, "Five");
		myArr[3]="Six";
		
		for (String s : myArr) {
			System.out.print(s + "  ");
		}
		
	}
	
	static class ReSortComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
		
	}

}
