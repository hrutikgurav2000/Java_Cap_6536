package array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {22, 44, 14, 56, 78, 14, 14, 6, 32};
		System.out.println("Enter element to search");
		int find = sc.nextInt();
		int c = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == find) {
				System.out.println("Element found at position: " +(i+1));
				c++;
			}
		}
		if(c==0)
			System.out.println("Element not found");
		else
			System.out.println("Total occurences of " +find+ " = " +c);
		sc.close();
	}

}
