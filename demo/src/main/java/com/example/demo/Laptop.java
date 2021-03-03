package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private int lId;
	private String brand;
	
	public Laptop() {
		super();
		System.out.println("Inside Laptop Constructor");
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", brand=" + brand + "]";
	}
	
	public void display()
	{
		System.out.println("Inside Laptop Display");
	}
}
