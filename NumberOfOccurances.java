package array;

import java.util.Scanner;

public class NumberOfOccurances {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter size of array1:");
		int size = sc.nextInt();
		int[] array1 = new int[size];
		
		
		for(int i=0;i<size;i++) {
			//System.out.println("Enter element to be add:");
			array1[i] = sc.nextInt();
		}
		
		System.out.println("Enter element to be search:");
		int key=sc.nextInt();
		int counter=0;
		for(int i=0;i<array1.length;i++) {
			if(key == array1[i]) {
				counter = counter+1;
			}	
		}
			if(counter !=0) {
				//System.out.println("Element found at "+counter+" position");
				System.out.println("Element occurances "+counter);
			}
			else{
				System.out.println("Element not found");
			}
			
			
			
	}

}
