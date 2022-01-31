package com.Bridgelabz.LgicalProgram;

import java.util.Scanner;

public class ReverseNo {
      
	static void reverse(int n) {
	   int reverse=0;
	    while(n>0)
	    {
		int r = n%10;
		reverse=(reverse*10)+r;
		n=n/10;
	    }
		System.out.println("Reverse of Number is "+reverse);

	}
	public static void main(String[] args) {
		System.out.println("Enter a Number of  ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        reverse(n);
	}

}
