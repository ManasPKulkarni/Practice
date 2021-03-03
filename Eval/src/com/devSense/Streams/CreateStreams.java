package com.devSense.Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CreateStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> myList = Arrays.asList(110.3, 111.0, 120.0, 119.5, 101.5, 109.3, 101.3);
		
		System.out.println("Number of days in last week the temperatures were high: " + myList.stream().filter(t -> t>105.3).count());
		
		
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("Manas", 90);
		myMap.put("Sam", 88);
		myMap.put("TRex", 94);
		myMap.put("Tiger", 83);
		
		System.out.println("Number of people having temperature more than 85 : " + myMap.entrySet().stream().filter(d->d.getValue()>85).count());
		
		String[] dogs = {"Boi", "Zooey", "Dracaris", "Snowey","GreyHound"};
		System.out.println("DOgs with names having more than 5 chars : " + Stream.of(dogs).filter(t->t.length()>5).count());
		
		System.out.println(Arrays.stream(dogs).count());
		
	}

}
