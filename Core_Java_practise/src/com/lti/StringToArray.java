package com.lti;

import java.util.Scanner;

/*
 * 1. write a a program to input string 
ex:i/p: java is fun
op:
java
is
fun


 */
public class StringToArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter an String:");
			String S1 = sc.nextLine();
			
			/*
			String strArray[] = S1.split(" ");
			System.out.println("String array : [ ");
			 
	        // Iterating over the string
	        for (int i = 0; i < strArray.length; i++) {
	            // Printing the elements of String array
	            System.out.println(strArray[i]);
	        } */
			
			//String strArray[] = {};
			for(int i=0;i < S1.length(); i++) {
				if(S1.charAt(i)==' ') { // whenever it found space it'll create separate words from string
		            System.out.println();
		            continue;
		        }
		        System.out.print(S1.charAt(i));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
