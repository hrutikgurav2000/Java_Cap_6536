package array;

import java.util.Scanner;

public class LinearSearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array2:");
		int siz = sc.nextInt();
		int[] array2 = new int[siz];
		for(int i=0;i<siz;i++) {
			System.out.println("Enter element to be add:");
			array2[i] = sc.nextInt();
		}
		
		System.out.println("Enter element to be search:");
		int check = sc.nextInt();
		int count=0;
		
		
		for(int i=0;i<siz;i++) {
			if(array2[i]==check) {
				System.out.print("Element found at index "+i);
				count++;
			}
			
			
		}
		if(count==0) {
			System.out.println("Element not found");
		}
		
	}

}
