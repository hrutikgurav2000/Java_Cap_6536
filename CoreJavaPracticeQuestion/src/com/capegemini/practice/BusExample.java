package com.capegemini.practice;

import java.util.Scanner;

public class BusExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// u will have login to validate user n login
		System.out.println("login successfull");
		System.out.println("Please select option from below:");
		System.out.println("1. you want to coninute as 'Bus admin' ");
		System.out.println("2. you want to coninute as 'Normal passanger' ");
		System.out.println("3. Exit");
		System.out.println("Please enter your choice:");
		int ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Now you are bus admin");
					System.out.println("1. Add Passenger");
					System.out.println("2. delete Passenger");
					System.out.println("3. search Passenger");
					System.out.println("4. Exit");
					System.out.println("Please enter you choice");
					int uch = sc.nextInt();
					switch(uch) {
					case 1: System.out.println("call function of add passenger");
							System.out.println("Enter your name");
							String sname = sc.next();
							System.out.println("Enter your age");
							int age = sc.nextInt();
							// Classname.insertfuncation(sname, age);
					break;
					case 2: System.out.println("call function of delete passenfer");
					break;
					case 3: System.out.println("search");
					break;
					default:
						System.exit(0);
					}
				 break;
			case 2: System.out.println("Now you are normal passenger");
					break;
					
			}
		
		System.out.println("Exited");
	}

}
