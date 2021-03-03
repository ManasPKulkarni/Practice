package com.devSense.welcome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution15 {

    static boolean isAnagram(String a, String b) {
		
        // Complete the function
    	
    	a = a.replaceAll("\\s", "").toLowerCase();
    	b = b.replaceAll("\\s", "").toLowerCase();
    	
    	if(a.length() != b.length())
    		return false;
    	
    	List<Character> l1 = new ArrayList<Character>();
    	List<Character> l2 = new ArrayList<Character>();
    	
    	for (int i = 0 ; i < a.length(); i++)
    	{
    		l1.add(a.charAt(i));
    		l2.add(b.charAt(i));
    	}
    	
    	Collections.sort(l1);
    	Collections.sort(l2);
    	
    	if(l1.equals(l2))
    		return true;
    	else
    		return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
        
    }
}
