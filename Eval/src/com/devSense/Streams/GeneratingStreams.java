package com.devSense.Streams;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GeneratingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stream.iterate(0, s-> s + 3)
//		.limit(10)
//		.forEach(System.out::println);
		
		Sensor s = new Sensor();
		Stream<String> senStream = Stream.generate(() -> s.next());
		
		Optional<String> result 
			= senStream.filter(v -> v.equals("down"))
			.findFirst();
		
		result.ifPresent(System.out::println);
		
		
		IntStream iStream = IntStream.rangeClosed(10, 20);
		iStream.forEach(n -> System.out.print(n + "\t"));
		
		System.out.println();
		
		IntStream evenBefore10 = IntStream.
				rangeClosed(1, 20).
				filter(p-> p%2 ==0)
				.limit(5);
		
		evenBefore10.forEach(n-> System.out.print(n + "\t"));
		
		System.out.println();
		
		IntStream evenAfter10 = IntStream
				.rangeClosed(1, 20)
				.filter(n-> n%2 ==0)
				.skip(5);
		
		evenAfter10.forEach(n-> System.out.print(n + "\t"));
	}

}


class Sensor{
	String value = "up";
	int i =0;
	public Sensor() {
		
	}
	
	public String next() {
		i = i + 1;
		return i > 1 ? "down": "up";
	}
}