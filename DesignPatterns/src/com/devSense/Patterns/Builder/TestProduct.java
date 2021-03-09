package com.devSense.Patterns.Builder;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = Product.newProduct()
							.id("1")
							.name("SONY 46")
							.description("BRAVIA")
							.value(2999.99)
							.build();

	}

}
