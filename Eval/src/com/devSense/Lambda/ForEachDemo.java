package com.devSense.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> dogNames = Arrays.asList("boi","zoi","clover");
		Consumer<String> printName = (name) -> System.out.print(name + "\t"  );
		System.out.println();
		
		dogNames.forEach(printName);
		
		Map<String, String> mu = System.getenv();
		BiConsumer<String, String> myEnv = (key, value) -> System.out.println(key + " : "+ value);
		
		mu.forEach(myEnv);
	}

}
