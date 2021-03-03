package com.devSense.welcome;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution2 {


		// TODO Auto-generated method stub
//	    public static void main(String[] args) throws InputMismatchException {
//	        Scanner scan = new Scanner(System.in);
//	        
//
//	        // Write your code here.
//	        
//	   
//	        int i = scan.nextInt();
//	        Double d = scan.nextDouble();
//	        scan.nextLine();
//	        String s = scan.next().toString();
//	    
//	        System.out.println("String: " + s);
//	        System.out.println("Double: " + d);
//	        System.out.println("Int: " + i);
//	}
	
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q =in.nextInt();
//        int a = 0;
//        int b = 0;
//        int n = 0;
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            System.out.println("q: " + q);
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("n: " + n);
            
            fun1(a,b,n);
            System.out.println();
        }
        
        
       
        in.close();
    }
	
	 public static void fun1(int a, int b, int n) {
     	
		int[] res = new int [n];
		for (int i = 0; i < n; i++) {
			if(i==0)
				res[i] = a;
			if(i>=1 && i <n)
				res[i] += res[i-1]; 
			res[i] += ((int)Math.pow(2, i) * b);
			
			System.out.print(res[i] + " ");
		}  
     }

}
