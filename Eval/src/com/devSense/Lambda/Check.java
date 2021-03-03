package com.devSense.Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//test() takes argument logical test execution and return boolean 
		Predicate<String> p = (s) -> s.equals("MyName");
		
		//accept() takes something but return nothing
		Consumer<String> c = (s) -> System.out.println(s);
		
		//get() returns something but takes nothing 
		Supplier<String> t = () -> "mans";
		
		
		//apply() takes arguement of type 1 and returns something of type 2
		Function<Integer, String> f = a -> {
			if(a == 36)
				return "Forty-Two";
			else
				return "Not for you";
		};
		
		System.out.println(f.apply(36));
		System.out.println(f.apply(546));
	}

}
