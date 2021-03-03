package com.devSense.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Optionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Double> myList = Stream.of(1.0, 2.0, 3.0, 4.0);
		
		Optional<Double> aNum = myList.findFirst();
		
		if(aNum.isPresent()) {
			System.out.println("First element in stream is : "+ aNum.get());
		}
		
//		aNum.ifPresent(n-> System.out.println());
		
		aNum.ifPresent(n-> System.out.println("Inside one condition : " + n.doubleValue()));
		
		
		/*------------------------------------------------------*/
		double [] myArr = {19.0, 2.0, 3.0, 4.0};
		DoubleStream myStream = Arrays.stream(myArr);
		
		OptionalDouble bNum = myStream.findFirst();
		
		if(bNum.isPresent()) {
			System.out.println("First element in stream is : "+ bNum.getAsDouble());
		}
		bNum.ifPresent(n-> System.out.println(n));
		
		/*------------------------------------------------------*/
		Dog d = new Dog("clover", 5, 25);
		
		Optional<Dog> opDog = Optional.of(d);
		opDog.ifPresent(System.out::println);
		
		/*------------------------------------------------------*/
		List<Dog> dogs = Arrays.asList(new Dog("boi",2,5));
		
		Optional<Dog> emptyDog = Optional.empty();
		if(!emptyDog.isPresent()) {
			System.out.println("Empty Dog must be empty");
		}
		emptyDog = dogs.stream().findFirst();
		if(emptyDog.isPresent()) {
			System.out.println("Empty Dog is no longer empty");
		}
	}

}
