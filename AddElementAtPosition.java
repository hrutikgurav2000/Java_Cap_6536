package array;

import java.util.Scanner;

public class AddElementAtPosition {

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
		
		System.out.print("Enter Position at which element to be added:");
		int pos =sc.nextInt();
		int ele;
		if(pos>size) {
			System.out.print("Out of Bound");
		}else {
			System.out.print("Enter element to be added");
			ele = sc.nextInt();
			
			for
		}
		
		
	}

}
