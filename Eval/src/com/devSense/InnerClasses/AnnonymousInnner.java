package com.devSense.InnerClasses;

//public interface Coockable {
//	public void cook() ;
//}

public class AnnonymousInnner {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Annonymouns Inner class flavour 1");
	}

	/*	With Flavour 1
	 * 	Annonymous Inner Class is a subclass of a class whose object is created. In case of 
	 * 	example below class Popcorn is a superclass of Annonymous Inner subclass
	 * 	This has a limitation that the subclass having a different non-overridden method
	 * 	then that method is not registered with the superclass object and hence the compilation 
	 * 	issue.
	 * 	To overcome this issue we need a Annonymous Inner class to implement a interface which 
	 * 	then can be instantiated and can refer the methods of Annonymous Inner class
	 * */
	
//	public interface Coockable {
//		public void cook();
//	}
	
	class Popcorn{
		public void pop() {
			System.out.println("popcorn");
		}
	}
	
	interface Coockable {
		public void cook() ;
	}

	
	class Food {
//		Popcorn p = new Popcorn() {
//			public void pop() {
//				System.out.println("Annonymous popcorn");
//			}
//			
//			public void sizzle() {
//				System.out.println("Annonymous sizzling popcorn");
//			}
//		};
		
		Coockable ck = new Coockable() {
			public void cook() {
				System.out.println("Implementing Coockable Interface as Annonymous class");
			}
		};
		
		
		public void popIt() {
			ck.cook();
			//p.pop();
			//p.sizzle();
		}
	}
	
	
}
