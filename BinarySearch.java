package array;

import java.util.Scanner;

public class BinarySearch {
	static int search(int[] arr, int find, int li, int ri) {
		if(li<=ri) {
			int mid = li + (ri - li)/2;
			if(arr[mid] == find)
				return mid;
			if(find < arr[mid])
				return search(arr, find, li, mid - 1);
			if(find > arr[mid])
				return search(arr, find, mid + 1, ri);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {22, 45, 65, 77, 82, 88, 95};
		System.out.println("Enter element to search");
		int find = sc.nextInt();
		int li = 0;
		int ri = arr.length -1;
		int pos = search(arr, find, li, ri);
		if(pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at position: " + (pos+1));
		sc.close();
	}

}
