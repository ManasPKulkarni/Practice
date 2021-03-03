package com.devSense.Lambda;
import java.util.*;
import java.util.function.BiConsumer;

public class UsecaseConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , String > env = System.getenv();
		BiConsumer<String, String> printEnv = (key, value) -> {
			System.out.println(key + " : "+  value);
		};
		
		printEnv.accept("USERNAME", env.get("USERNAME"));
		System.out.println("------------------------------------------------");
		env.forEach(printEnv);
	}

}
