package array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeOfArray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array1:");
		int size = sc.nextInt();
		int[] array1 = new int[size];
		
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter element to be add:");
			array1[i] = sc.nextInt();
		}
		
		System.out.print("Enter size of array2:");
		int siz = sc.nextInt();
		int[] array2 = new int[siz];
		for(int i=0;i<siz;i++) {
			System.out.println("Enter element to be add:");
			array2[i] = sc.nextInt();
		}
		int d = size+siz;
		int[] array3 = new int[d];
		
		for(int i=0;i<array1.length;i++) {
			array3[i] = array1[i];
		}
		
		for(int i=0;i<array2.length;i++) {
			array3[size+i] = array2[i];  //adding element at size + index example if array one was
		}                            // of size 5 then new element to be add 
		
		int k=0;
		outer:
			for(int i=0;i<array3.length;i++) {
				inner:
					for(int j=0;j<i;j++) {
						if(array3[i]==array3[j]) {
							continue outer;
						}
					}
				k++;
			}
		
		
		int b[]=new int[k];
		int k1=0;
		outer:
			for(int i=0;i<array3.length;i++) {
				inner:
					for(int j=0;j<i;j++) {
						if(array3[i]==array3[j]) {
							continue outer;
						}
					}
				b[k1]=array3[i];
				k1++;
			}
		
		System.out.println("Final merged Array....");
		for(int i=0;i<b.length;i++) {
			System.out.println("Element present at "+i+" is ="+b[i]);
		}
	}

}
