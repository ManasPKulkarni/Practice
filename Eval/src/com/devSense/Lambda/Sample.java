package com.devSense.Lambda;

import java.util.Map;
import java.util.function.Supplier;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> user = new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				Map<String, String> mu = System.getenv(); 
				return mu.get("USERNAME");
			}
			
		};
		
		System.out.println(user.get());
	}

}
