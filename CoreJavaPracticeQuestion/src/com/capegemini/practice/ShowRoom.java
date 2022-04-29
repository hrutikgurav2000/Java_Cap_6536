package com.capegemini.practice;
/*
 * Design a class name ShowRoom with the following description :
Instance variables/ Data members :
String name – To store the name of the customer
long mobno – To store the mobile number of the customer
double cost – To store the cost of the items purchased
double dis – To store the discount amount
double amount – To store the amount to be paid after discount
Member methods: –
ShowRoom() – default constructor to initialize data members
void input() – To input customer name, mobile number, cost
void calculate() – To calculate discount on the cost of purchased items, based on following criteria
void display() – To display customer name, mobile number, amount to be paid after discount
Cost	Discount (in percentage)
Less than or equal to  10000	5%
More than 10000 and less than or equal to  20000	10%
More than 20000 and less than or equal to  35000	15%
More than  35000	20%
 */

import java.util.Scanner;

public class ShowRoom {
	Scanner sc = new Scanner(System.in);
	String name;
	long mobbno;
	double cost;
	double dis;
	double amount;
	public ShowRoom() {
		super();
		
	}

	
	private void input() {
		// TODO Auto-generated method stub
		System.out.println("Enter your name:");
		name = sc.nextLine();
		System.out.println("Enter mobno:");
		mobbno = sc.nextLong();
		System.out.println("Enter Cost:");
		cost = sc.nextDouble();
		
		
	}
	
	private void calculate(double cost) {
		System.out.println(cost);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShowRoom  ob = new ShowRoom();
		ob.input();
		ob.calculate();
	}



	

}
