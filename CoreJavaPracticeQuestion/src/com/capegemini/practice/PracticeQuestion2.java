package com.capegemini.practice;

import java.util.Scanner;

/*
 * Write a program to convert lower case string to uppercase
 * and also count number for words starting with "A"
 */
public class PracticeQuestion2 {

	void count(String s) {
		s = s.toUpperCase();
		int count=0;
		boolean flag = false;
		
		if(s.charAt(0) == 'A') {
			flag = true;
		}
		
		for(int i = 0; i < s.length()-1; i++) {
			
			if(s.charAt(i) == ' ' && s.charAt(i+1) == 'A') {
				count = count + 1;
			}
		}
		if(flag) {
			count = count + 1;
		}
		System.out.println(count);
		/* String[] arrOfStr = s.split(" ");
		
		
		for(int j = 0; j < arrOfStr.length; j++ ) {
			for(int i = 0; i < arrOfStr[j].length();j++) {
				
			}
		}
		*/
		
		/*
		for (String s1 : arrOfStr) {
		      System.out.print(s1 + ", ");
		    }	
		*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: - ");
		String s = sc.nextLine();
		PracticeQuestion2 ob = new PracticeQuestion2();
		ob.count(s);
		
	}

}
