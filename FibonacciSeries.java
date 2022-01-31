package com.Bridgelabz.LgicalProgram;

import java.util.Scanner;

public class FibonacciSeries {

	static void fib(int n) {
		int a=0;
		int b=1;
		int c;
		  System.out.println("Fibonacci Series for " +n+ " term is");
		  System.out.print(+a+" "+b);

		for(int i=2;i<=n;i++)
		{
			
		  c =a+b;
	      System.out.print(" "+c);
          a=b;
		  b=c;

	    }
	
	}
	public static void main(String[] args) {
		
		System.out.println("Enter Number of term ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		fib(n);
	 
        

	}

}

