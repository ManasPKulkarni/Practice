package com.devSense.demo;

public class SampleFibbo {

	static int fib(int n)
    {
    /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0
    int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
     System.out.print(f[0] + " "+ f[1]+ " ");
    for (i = 2; i <= n; i++)
    {
       /* Add the previous 2 numbers in the series
         and store it */
        f[i] = f[i-1] + f[i-2];
        System.out.print(f[i] + " ");
    }
    System.out.println(" ");
    return f[n];
    }
	
	
    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
      
        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }


      
    public static void main (String args[])
    {
        int n = 9;
//        System.out.println(fib(n));
        
        System.out.println(fibonacci(n));
        
        
//        int [] fib = new int[10] ;
////        int a = 0;
//         fib[0] =  0;
//         fib[1] = 1;
//
//        for(int i = 0; 1<10; i++)
//        {	if(i>2) {
//        	fib[i] = fib[i] + fib[i-1];
//        	}
//        else {
//        	System.out.println(fib[i]);}
//        
//        }
    }
}
