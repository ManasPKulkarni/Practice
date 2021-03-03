package com.devSense.welcome;

import java.io.*;
import java.util.*;

public class Solution16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String [] ch = null ;
        // Write your code here.
        
        if (s.trim().length()==0 || s.trim().length()>400000)
        {
            System.out.println(0);
            return;
        }
 
        if(s.length()>0)
        {
        	String [] token = s.trim().split("[ !,?.\\_'@]+");
        	System.out.println(token.length);
        	for (String string : token) {
				System.out.println(string);
			}
        }
        
        scan.close();
    }
}

