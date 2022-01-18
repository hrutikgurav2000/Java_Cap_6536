package array;

import java.util.Scanner;

public class DelementAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array1:");
		int size = sc.nextInt();
		int[] array1 = new int[size];
		
		for(int i=0;i<size;i++) {
			//System.out.println("Enter element to be add:");
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter element to be deleted:");
		int del = sc.nextInt();
		int count=0;
		for(int i=0;i<array1.length;i++) {
			
			if(del==array1[i]) {
				
				for(int j=i;j<array1.length-1;j++) {
					array1[j]=array1[j+1];
				}
				count=count+1;
				break;
			}
		}
		if(count==0) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element deleted");
		}
		for(int i=0;i<array1.length-1;i++) {
				System.out.println(array1[i]);
			}
		sc.close();
		}
		
	}


