package com.lti;

import java.util.Scanner;

/*
 * 
 * 
2. write a program in string
accept a String
ex: capegimin full stack java developer

o/p:
capegimini->10
full->4
stack->5
java->4
developer->10
 */
public class CountStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter an String:");
			String S1 = sc.nextLine();
			/*int count = 0;
			String[] strtochar = S1.split(" ");
			for(int i=0;  i < S1.length(); i ++) {
				
				//System.out.println(strtochar[i]);
				if(!(S1.charAt(i)==' ')) {
					count ++ ;
				}
			}
			System.out.println(count);
			*/
			int count=0;
			String[] strtochar = S1.split(" ");
			for(int i=0; i < strtochar.length ; i++) {
				//count=0;
				for(int j = 0; j < strtochar[i].length(); j++) {
					 if(!(strtochar[i][j] == ' ')) {
						 
					 }
				}
				System.out.println(count);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			sc.close();
		}
	}

}
