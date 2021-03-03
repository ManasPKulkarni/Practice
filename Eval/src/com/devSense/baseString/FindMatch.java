package com.devSense.baseString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMatch {

	char [] set = {'a','e','i','o','u'};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			String myInput = bufferedReader.readLine();
			String subSt ="";

			int maxOccur =0;
			int len = myInput.length() ;
			int leastpost=0;
			int[] Occurance = new int[len ];
			int k = 5;
			
			for (int i = 0; i < len ; i++) {
				if(i+k <= len ) {
					subSt = myInput.substring(i, i+k);
					
					Occurance[i] = countVowels(subSt, k);
					System.out.println("for substring : "+ subSt + " vowels occured for : " + Occurance[i] + " number of times at position : "+ i );
					
						if (i>= 1 && Occurance[i-1] > maxOccur) {
						maxOccur = Occurance[i-1];
						leastpost= i-1;
					}

				}
			}
			
			System.out.println("Maximum occurance of vowels is : "+ maxOccur + " times at a least position of " + leastpost);
		
	}
	
	public static int countVowels(String s, int k) {
		int count = 0;
		for (int i = 0; i < k; i++) {
			if (s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o' ||s.charAt(i)=='u')
				count++;
		}
		
		return count;
	}

}
