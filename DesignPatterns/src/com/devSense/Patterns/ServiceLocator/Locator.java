package com.devSense.Patterns.ServiceLocator;

public class Locator {

	private static Cache cache;
	
	static {
		cache = new Cache();
	}
	
	public static Service getService(String name) {
		
		Service service = cache.getService(name);
		
		if(service!=null) {
			return service;
		}
		
		InitialContext context = new InitialContext();		
		Service myServ = (Service) context.Lookup(name);
		cache.addService(myServ);
		return myServ;
	}
}
