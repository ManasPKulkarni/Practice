package com.devSense.misc;

public class AccessInstanceVarFromStaticMethod {
	
	/* I am trying to see if i can access the non-static/instance variable from a 
	 * static method
	 * For trial I have created a 
	 * a static variable which has been assigned with Instance of a class 
	 * and it is working as expected
	 * Now the static method can access the instance varialbe if the method is passed
	 * the reference to the object/instance as input.
	 * */

	private static Object staticRefVariable;
	
	private String name;
	private String tech;
	
	
	
	public AccessInstanceVarFromStaticMethod() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "AccessInstanceVarFromStaticMethod [name=" + name + ", tech=" + tech + "]";
	}
	

	public AccessInstanceVarFromStaticMethod(String name, String tech) {
		super();
		this.name = name;
		this.tech = tech;
	}
	
	public static Object getStaticRefVariable() {
		return staticRefVariable;
	}
	
	public static void setStaticRefVariable(Object staticRefVariable) {
		AccessInstanceVarFromStaticMethod.staticRefVariable = staticRefVariable;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public static String getObjectVal(AccessInstanceVarFromStaticMethod ref) {
		String out = ref.getName().concat(" : ".concat(ref.getTech()));
		return out;
		
	}
	
	public static void main(String[] args) {		
		AccessInstanceVarFromStaticMethod a = new AccessInstanceVarFromStaticMethod();
		
		AccessInstanceVarFromStaticMethod b = new AccessInstanceVarFromStaticMethod();
		a.setName("Manas");
		a.setTech("Java");
		
		b.setName("Harold");
		b.setTech("C");
		
		setStaticRefVariable(a);
		
//		staticRefVariable = a;
		
		System.out.println("Object is : "+ a.toString());
		
		System.out.println("Object is : "+ staticRefVariable);
		
		setStaticRefVariable(b);
		
		System.out.println("Object is : "+ b.toString());
		
		System.out.println("Object is : "+ staticRefVariable);
		
		System.out.println("Printing below from the Static method ");
		System.out.println(AccessInstanceVarFromStaticMethod.getObjectVal(a));
	}
	
}
