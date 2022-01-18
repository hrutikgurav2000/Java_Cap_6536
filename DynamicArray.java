package array;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example of Dynamic array
		int arr[];
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[10];
		for(int i=0;i<array1.length;i++) {
			System.out.println("Enter element to be add:");
			array1[i] = sc.nextInt();
		}
		
		for(int i=0;i<array1.length;i++) {
			System.out.println("Enter element from array:"+array1[i]);
			//array1[i] = sc.nextInt();
		}
		sc.close();
	}

}
