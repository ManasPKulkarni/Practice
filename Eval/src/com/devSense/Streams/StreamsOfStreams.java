package com.devSense.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsOfStreams {
	
	public static void main(String [] args) throws IOException {
		Stream<String> input = Files.lines(Paths.get("E:\\Users\\Manas Kulkarni\\Prep\\Eval\\src\\com\\devSense\\Streams\\scrambles.txt"));
//		input.map(line -> line.split(" "));
//		System.out.println(input.map(line -> line.split(" ")));

		Stream<String[]> ipstream = input.map(d -> d.split(" "));
//		System.out.println(ipstream);
		
		
		//This actually is a stream of streams of String
//		ipstream.map(d -> Arrays.stream(d)).forEach(System.out::println);
		
//		Stream<Stream<String>> ss = ipstream.map(d -> Arrays.stream(d));
		//Still seeing the Stream of String rather than a String as I expected mapping does not seem to work ?
//		ss.forEach(System.out::println);
		
		//So lets try a flatmap instead a map
		Stream<String> ss1 = ipstream.flatMap(d-> Arrays.stream(d));
		ss1.forEach(System.out::println);
		
		/*Now to the actual part of counting the occurance of a particular word say 'Java'*/
		
		/*
		try {
			Long n = Files.lines(Paths.get("C:\\Users\\Manas Kulkarni\\Prep\\Eval\\src\\com\\devSense\\Streams\\scrambles.txt"))
					.map(D-> D.split(" "))
					.flatMap(a-> Arrays.stream(a))
					.filter(s -> s.equals("Java"))
					.count();				
					
			System.out.println("Number of occurances of a word Java : "+ n);
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
	}
}
