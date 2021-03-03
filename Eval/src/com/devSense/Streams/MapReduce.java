package com.devSense.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Reading{
	int year;
	int month;
	int day;
	double value;
	
	Reading(int y, int m, int d, double v){
		this.year = y;
		this.month = m;
		this.day = d;
		this.value = v;
	}
}
public class MapReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Reading> readings = Arrays.asList(
				new Reading(2020, 12, 29, 405.2),
				new Reading(2020, 12, 30, 405.2),
				new Reading(2020, 12, 31, 406.20),
				new Reading(2021, 1, 1, 406.48),
				new Reading(2021, 1, 2, 406.98),
				new Reading(2021, 1, 16, 406.14),
				new Reading(2021, 1, 20, 407.14),
				new Reading(2021, 1, 20, 406.25)				
				);
		
		OptionalDouble finalVal=
		readings.stream()
		.mapToDouble(r-> r.value)
		.filter(v -> v >= 406.00 && v< 407.00)
		.average();
		
		if(finalVal.isPresent())
			System.out.println("Average Value is : "+ finalVal.getAsDouble());
		else
			System.out.println("Empty OptionalDouble");
		
		
		Supplier<Stream<List<Reading>>> streamSupplier = () -> Stream.of(readings);
		

//		Stream<List<Reading>> newMyStream = streamSupplier.get();
//		newMyStream.mapToDouble)
//		OptionalDouble fintest = newMyStream.mapToDouble(r -> r.value).filter(v -> v>= 406.00 && v<407.00).max();
		
		OptionalDouble finalVal2=
				readings.stream()
				.mapToDouble(r-> r.value)
				.filter(v -> v >= 406.00 && v< 407.00)
				.max();
		
		if(finalVal2.isPresent())
			System.out.println("Average Value is : "+ finalVal2.getAsDouble());
		else
			System.out.println("Empty OptionalDouble");
	}

}
