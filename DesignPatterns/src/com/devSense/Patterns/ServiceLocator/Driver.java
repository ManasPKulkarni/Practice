package com.devSense.Patterns.ServiceLocator;

//ServiceLocator Pattern Demo

/*----------------------------------------------------------------------------------
Advantages :

    Applications can optimize themselves at run-time by selectively adding and removing items from the service locator.
    Large sections of a library or application can be completely separated. The only link between them becomes the registry.

Disadvantages :

    The registry makes the code more difficult to maintain (opposed to using Dependency injection), 
    	because it becomes unclear when you would be introducing a breaking change.
    The registry hides the class dependencies causing run-time errors instead of compile-time errors when dependencies are missing.

Strategies

The following strategies are used to implement service Locator Pattern :

    EJB Service Locator Strategy : This strategy uses EJBHome object for enterprise bean components 
    	and this EJBHome is cached in the ServiceLocator for future use when the client needs the home object again.
    JMS Queue Service Locator Strategy : This strategy is applicable to point to point messaging requirements. 
    The following the strategies under JMS Queue Service Locator Strategy.
        JMS Queue Service Locator Strategy
        JMS Topic Service Locator Strategy
    Type Checked Service Locator Strategy : This strategy has trade-offs. 
    It reduces the flexibility of lookup, which is in the Services Property Locator strategy, 
    but add the type checking of passing in a constant to the ServiceLocator.getHome() method.

    ----------------------------------------------------------------------------------*/
public class Driver {

	public static void main(String [] args)
	{
		Service service = Locator.getService("ServiceOne");
		service.execute();
		
		System.out.println("--------------------------------------------");
		service = Locator.getService("ServiceTwo");
		service.execute();
		
		System.out.println("--------------------------------------------");
		service = Locator.getService("ServiceOne");
		service.execute();
		
		System.out.println("--------------------------------------------");
		service = Locator.getService("ServiceTwo");
		service.execute();
		
		System.out.println("--------------------------------------------");
		
	}
}
