package com.devSense.Lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.format("Total = %.3f", computeTax(10.00, (p) -> p* 0.05));
	}

	static double computeTax(double price, UnaryOperator<Double> op) {
		return op.apply(price)+ price ;
	}
}
