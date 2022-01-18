package array;

import java.util.Scanner;

public class SumOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[5];
		for(int i=0;i<array1.length;i++) {
			System.out.println("Enter element to be add:");
			array1[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<array1.length;i++) {
			System.out.println("Enter element from array:"+array1[i]);
			//array1[i] = sc.nextInt();
			sum= sum + array1[i];
			
		}
		System.out.println("Sum of element "+sum);
		float avg = sum/ array1.length;
		System.out.println("avg of element "+avg);
		
	}

}
