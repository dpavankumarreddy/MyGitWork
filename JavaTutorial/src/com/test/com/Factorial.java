package com.test.com;

import java.io.IOException;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		//int p = System.in.read();
		//System.out.println("p = " + p);
		int factorial=1;
		for(int i=1;i<=n;i++)
		{
		factorial= factorial*i;
		System.out.println("value = " + factorial);
		System.out.println("i=" + i);
		}
		System.out.println(factorial);
		
		
	}

}
