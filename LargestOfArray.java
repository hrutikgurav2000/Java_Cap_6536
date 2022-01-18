package array;

import java.util.Scanner;

public class LargestOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		int[] array1 = new int[size];
		int[] array2 = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter element to be add:");
			array1[i] = sc.nextInt();
		}
		
		int max = array1[0];
		int min = array1[0];
		
		for(int i=0;i<array1.length;i++) {
			if(array1[i]>max) {
				max = array1[i];
			}
			if(array1[i]<min)
			{
				min = array1[i];
			}	
			
		}
		
		
		
		System.out.println("Largest of Array: "+max);
		System.out.print("smallest of Array: "+min);
		sc.close();
	}

}
