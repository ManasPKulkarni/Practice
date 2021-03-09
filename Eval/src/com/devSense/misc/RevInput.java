package com.devSense.misc;

import java.util.Scanner;

public class RevInput {

	public static void main(String[] args) {
		
//		String input = "\" This Year is \" 2021";
		Scanner scan = new Scanner(System.in);
		
		String ip = scan.nextLine();
		String[] myLiterals = ip.split(" ");
		

		for (int i=myLiterals.length-1; i>=0; i--) {
				
				if(i==3)
				{
					StringBuilder sb = new StringBuilder(myLiterals[i]);
					System.out.print(sb.charAt(sb.length()-1));
					System.out.print(sb.charAt(0));
					System.out.print(sb.charAt(1));
					System.out.print(" ");
				}
				else {
				System.out.print(myLiterals[i]);
				System.out.print(" ");
				}
		}
		
	}

}


//2021 " is Year This " 
//2021 " is Year This " ---Output

//" This Year is " 2021
//2021 " is Year This " 