package com.devSense.welcome;

import java.io.*;
import java.util.*;

public class Solution11 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int combinedLength = A.length() + B.length();
        
        int isALarger = A.compareTo(B);
        String CompAns = "";
        
        if(isALarger < 0 )
        	CompAns = "No";
        else if(isALarger > 0)
        	CompAns = "Yes";
        else 
        	CompAns = "Matching";
        
        String finalStr = A.substring(0, 1).toUpperCase()+ A.substring(1, A.length()) + " " + B.substring(0, 1).toUpperCase()+B.substring(1, B.length()) ;
        
        System.out.println(combinedLength);
        
        System.out.println(CompAns);
        
        System.out.println(finalStr);
    }
}




