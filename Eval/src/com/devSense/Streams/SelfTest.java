package com.devSense.Streams;

import java.util.Arrays;

public class SelfTest {
	
	public static void main(String [] args) {
		
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		
//		int sum = Arrays.stream(nums).sum();
		int sum = Arrays.stream(nums).reduce(0, (n1,n2) ->n1 +n2);
		
		System.out.println(sum);
	}

}
