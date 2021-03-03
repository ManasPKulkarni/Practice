package com.devSense.misc;

public class Version6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class par = Parent.class;
		System.out.println(par);
		
		Parent p = new Parent();
		Grandparent gp = new Grandparent();
		GrandChild gc = new GrandChild();
		
		Object o = gp;
		
		if(o instanceof Parent) {
			System.out.println("Parent is a child of grandParent");
		}
		
		if(Parent.class.isAssignableFrom(par)) {
			System.out.println("Assignable");
		}
		
		System.out.println(Parent.class.getSuperclass());

	}

}

class Grandparent{
	String FamilyName;
	String business;
	
	public Grandparent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFamilyName() {
		return FamilyName;
	}
	public void setFamilyName(String familyName) {
		FamilyName = familyName;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	
	
}

class Parent extends Grandparent{
	String Degree;
	String businessBranch;
	
	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parent(String degree, String businessBranch) {
		super();
		Degree = degree;
		this.businessBranch = businessBranch;
	}
	
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public String getBusinessBranch() {
		return businessBranch;
	}
	public void setBusinessBranch(String businessBranch) {
		this.businessBranch = businessBranch;
	}
	
}


class GrandChild extends Parent{
	String Technology;
	String Client;
	
	public GrandChild() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTechnology() {
		return Technology;
	}

	public void setTechnology(String technology) {
		Technology = technology;
	}

	public String getClient() {
		return Client;
	}

	public void setClient(String client) {
		Client = client;
	}
	
}