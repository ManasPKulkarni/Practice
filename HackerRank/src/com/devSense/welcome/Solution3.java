package com.devSense.welcome;

import java.util.*;
import java.io.*;



class Solution3{
    public static void main(String []argh) throws IOException
    {



        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
        String s = null;
        int count =1;
//        while (sc.hasNext())
//        {
//        	s = sc.nextLine();
//        	System.out.println(s);
//        }
//        System.out.println(s);
//        
//        InputStreamReader ir = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(ir);
        
        while (sc.hasNext())
        {
//        	s= br.readLine();
        	System.out.println(count + " " + sc.nextLine());
        	count++;
        }
//        System.out.println(s);
//        for(int i=0;i<t;i++)
//        {
//
//            try
//            {
//                long x=sc.nextLong();
//                double valShort = Math.pow(2, 15)-1;
//                double valInt = Math.pow(2, 31)-1;
//                double valLong = Math.pow(2, 63)-1;
//                
//                System.out.println(x+" can be fitted in:");
//                if(x>=-128 && x<=127)System.out.println("* byte");
//                
//                if((x>= -valShort) && (x< valShort))
//                {
//                    System.out.println("* short");
//                }
//                if((x>= -(valInt)) && (x< valInt))
//                {
//                    System.out.println("* int");
//                }
//                if((x>= -(valLong)) && (x < valLong))
//                {
//                    System.out.println("* long");
//                }
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//
//        }
    }
}




