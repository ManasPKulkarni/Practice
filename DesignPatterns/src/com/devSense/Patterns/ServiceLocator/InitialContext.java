package com.devSense.Patterns.ServiceLocator;

import java.util.ArrayList;
import java.util.List;

public class InitialContext {

	public Object Lookup(String name) {
		
		if(name.equalsIgnoreCase("ServiceOne")) {
			System.out.println("Creating new Object for ServiceOne");
			return new ServiceOne();
		}else if (name.equalsIgnoreCase("ServiceTwo")) {
			System.out.println("Creating new Object for ServiceTwo");
			return new ServiceTwo();
		}		
		return null;
	}
}

class Cache{
	
	private List<Service> services;
	
	public Cache() {
		services = new ArrayList<Service>();
	}
	
	public Service getService(String serviceName) {
		
		for (Service service : services) {
			if(service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning cached " + serviceName + " object");
				return service;
			}
		}
		
		return null;
	}
	
	public void addService(Service newService) {
		boolean exists = false;
		for (Service service : services) {
			if(service.getName().equalsIgnoreCase(newService.getName())) {
				exists = true;
			}
		}
		
		if(!exists) {
			services.add(newService);
		}
	}
}


