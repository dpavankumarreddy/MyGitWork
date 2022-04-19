package com.test.com;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for (int x = 1; x <= 1000; x++) {
		int a,i=0,j=0;
		a=n;
		while(a>0) {
		i=a%10;
		j=(i*i*i)+j;
		a=a/10;
		}
		if(n==j) {
		System.out.println("It is amstrong");
		}
		else {
		System.out.println("It is not a amstrong");
		}

	}
	}

}
