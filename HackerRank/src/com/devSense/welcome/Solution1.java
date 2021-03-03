package com.devSense.welcome;

import java.util.Scanner;

public class Solution1 {

	  private static final Scanner scanner = new Scanner(System.in);
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World.");
		System.out.println("Hello, Java.");
		
		int n =2;
		
		if(n<=5 && n>=2) {
			System.out.println("In the range");
		}
		
		
		
		 int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        
	        if(N!=0 && N<100){
	            if(N%2==1){
	                System.out.println("Weird");
	            }
	            else if(N%2==0){
	                if(N<=5 && N>=2){
	                    System.out.println("Not Weird");
	                }
	                else if(N<=20 && N>=6){
	                    System.out.println("Weird");
	                }
	                else if(N>20){
	                    System.out.println("Not Weird");
	                }
	                    
	            }
	        }

	        scanner.close();
	}

}
