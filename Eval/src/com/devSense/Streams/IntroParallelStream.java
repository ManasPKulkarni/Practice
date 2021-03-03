package com.devSense.Streams;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class IntroParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10 );
//		System.out.println(LocalTime.now());
		LocalTime one = LocalTime.now();
		
		int sum =
		nums.stream()
		.mapToInt(n -> n)
		.sum();
		
		System.out.println("Sum of numbers nums is : "+ sum);
//		System.out.println(LocalTime.now());
		
		LocalTime two = LocalTime.now();
		
		LocalTime diff = two.minusNanos(one.toNanoOfDay());
		System.out.println(diff);
		/*---------------------------------------------------------------------------------------*/
		System.out.println("---------------------------------------------------------------------------------------");
		
		List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10 );
//		System.out.println(LocalTime.now());
		LocalTime three = LocalTime.now();
		
		int sum1 =
		nums1.stream()
		.parallel()
		.mapToInt(n -> n)
		.sum();
		
		System.out.println("Sum of numbers nums is : "+ sum1);
//		System.out.println(LocalTime.now());
		LocalTime four = LocalTime.now();
		
		LocalTime diff1 = four.minusNanos(three.toNanoOfDay());
		System.out.println(diff1);
	}

}
