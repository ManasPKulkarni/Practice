package com.devSense.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> birds = Arrays.asList("eagle", "seagull","buzzard","goose");
//		
//		int longest =0;
//		
//		birds.forEach((b) -> {
//			if(b.length() > longest)
//				longest = b.length();
//		});
		
		
		/*-------------------------------------------------------------------------*/
		
//		Supplier<List<Double>> readingsSupplier = 
//				(Supplier<List<Double>>) Arrays.asList(405.91, 405.98);
//		
//		for (Double r:readingsSupplier.get()) {
//			System.out.println(r);
//		}
		
		
		BiFunction<Integer, String, String> foo = (n, s) -> {
			String newStr = "";
			for (int i = 0; i < n; i++) {
				newStr = s + " " + newStr;
			}
			return newStr;
		};
		
		Function<String, String> bar = (s) -> s + "bar";
		System.out.println(foo.andThen(bar).apply(3, "foo"));
//		System.out.println(bar.andThen(foo).apply("foo"));
	}

}
