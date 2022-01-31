package com.Bridgelabz.LgicalProgram;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number of  ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,i;
		for(i=1;i<n;i++)
		{
		    if(n%i==0)
               sum=sum+i;		
		}
       if(n==sum)
   		    System.out.println("It is Perfect No ");
       else
      		System.out.println("It is Not Perfect No ");

    	   
	}      

}
