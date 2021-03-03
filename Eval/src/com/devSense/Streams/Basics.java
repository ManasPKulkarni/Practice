package com.devSense.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;



public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] mynums = {1,2,5,3};
//		Stream<Integer> myStream = Arrays.stream(mynums);

		Supplier<Stream<Integer>> streamSupplier = () -> Stream.of(mynums);
		

		Stream<Integer> newMyStream = streamSupplier.get().filter(i -> i<5); 
//				myStream.filter(i -> i < 5);
		
		long numElementsmatchingrequirements = 
				 streamSupplier.get()
				.filter(i -> i > 2)
				.count();
		
		long filnumElementsmatchingrequirements = 
				newMyStream.filter(i -> i > 2)
				.count();
		
		System.out.println("Number of elements > 2 from original Stream : " + numElementsmatchingrequirements);
		System.out.println("Number of elements > 2 from filtered Stream : " + filnumElementsmatchingrequirements);
		
//		Count is the terminal operation because stream ends there 
//		and no more data flows through the stream
//		System.out.println(myStream.count());
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		list1.stream().map(n -> n*n).filter(n -> n>20).forEach(System.out::println);
		
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		Long result = list2.stream()
		.peek(n -> System.out.print("Number is : " + n + " , "))
		.map(n -> n*n).filter(n -> n>20).
		peek(n -> System.out.println("Square is : "+ n + ", ")).
		count();
		
		System.out.println("Result is : "+ result);
	}

}
