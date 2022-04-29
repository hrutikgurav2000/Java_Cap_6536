package com.capegemini.practice;

import java.util.Scanner;

/*
 * Write a java program to find below series
 * void series(int x, int n)
 * x1 + x2 + x3 + .... xn
 */
public class PracticeQuestion1 {

	public void series(int x , int y) {
		long sum = 0;
		for(int i=1; i <= y; i++) {
			long power = (long) Math.pow(x, i);
			//System.out.println(power);
			sum = sum + power;
		}
		System.out.println("a. answer for X^1 + x^2 + .... + x^n :" + sum);
	}
	
	public void series(int x) {
		long sum = 0;
		System.out.println("b. answer for (X^3 - 1) + (x^3 - 1 )  + .... + (x^3 - 1):");
		for(int i=1; i <= x; i++) {
			long power = (long) Math.pow(i, 3) - 1;
			System.out.print(power + " ");
		}
		
	}
	
	public void series() {
		float sum = 0;
		int x = 10;
		System.out.println("c. answer for 1/2  + 1 /3 + ... 1 / x: ");
		for(int i = 2; i < x; i++) {
			sum = sum + (float)1/i;
		}
		
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			
			PracticeQuestion1 ob = new PracticeQuestion1();
			
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter value of x: ");
					int x = sc.nextInt();
					System.out.println("Enter value of n: ");
					int y = sc.nextInt();
					ob.series(x,y);
					break;
			case 2: System.out.println("Enter value of x: ");
					int x1 = sc.nextInt();
					ob.series(x1);
					break;
			case 3: ob.series();
					break;
			}
			
			
			 
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
