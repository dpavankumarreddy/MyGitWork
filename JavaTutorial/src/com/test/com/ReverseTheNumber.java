package com.test.com;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number");
		//int n = sc.nextInt();
		int a=56;
		int i=0,j=0;
	
		while(a>0) {
		i=a%10;
		System.out.println("i ="+i);
		j=(j*10)+i;
		System.out.println("j ="+j);
		a=a/10;
		System.out.println("a ="+a);
		}
		System.out.println("The reverse number is "+j);

	}

}
