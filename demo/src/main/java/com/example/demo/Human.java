package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Human {

	private int age;
	private String name;
	private String status;
	
	public Human() {
		super();
		System.out.println("Human Object Created...");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
