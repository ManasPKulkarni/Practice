package com.devSense.welcome;

import java.util.Scanner;
import java.util.regex.*;

public class Solution17
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}




