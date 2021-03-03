package com.devSense.InnerClasses;

class A {
	void m() {
		System.out.println("Outer");
	}
}

public class TestInners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestInners().go();
	}

	void go() {
		new A().m();
//		class A {
//			void m() {
//				System.out.println("Inner");
//				}
//			}
	}
	
	class A {
		void m() {
			System.out.println("Middle");
			}
		}
}
