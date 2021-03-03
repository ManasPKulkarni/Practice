package com.devSense.welcome;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution7 {
    
    @SuppressWarnings("static-access")
	public static void main(String[] args) {
    	DecimalFormat df2 = new DecimalFormat("#.##");
    	
    	
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        double max = Math.pow(10, 9);
        double min = 0;
        
        if(payment>= min && payment <= max )
        {
        	Currency curr = Currency.getInstance(Locale.US);
            
            
        	DecimalFormat  decimalF = new DecimalFormat("###.##");
//            NumberFormat myformat = new DecimalFormat("#0.00");
            //myformat.setMaximumFractionDigits(2);

            String us =  curr.getSymbol() + "" + NumberFormat.getInstance(Locale.US).format(payment);
            System.out.println("US : " + us);


            String india =  "RS." + "" + String.valueOf(NumberFormat.getInstance(Locale.US).format(decimalF.format(payment)));
            System.out.println("INDIA : " + india);
            
            
            Currency curr1 = Currency.getInstance(Locale.FRANCE);
            String FR = String.valueOf(NumberFormat.getInstance(Locale.FRENCH).format(payment)) + " "+ curr1.getSymbol();
            System.out.println("France : " + FR);
            

            Currency curr2 = Currency.getInstance(Locale.CHINA); 
            String CN = curr2.getSymbol().substring(curr2.getSymbol().length()-1) + " " + String.valueOf(NumberFormat.getInstance(Locale.CHINA).format(payment));
            System.out.println("CHINA : " + CN);
     
        	
        }
               
        
    }
}