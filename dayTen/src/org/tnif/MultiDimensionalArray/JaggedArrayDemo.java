package org.tnif.MultiDimensionalArray;
import java.util.*;
public class JaggedArrayDemo {

	public static void main(String[] args) {
		// in jagged array outside array size is fixed, but inside arrays size is different outside array index
		//jagged array declaration
		int arr[][]=new int[2][];
		Scanner sc=new Scanner(System.in);
		//for outside array index 0, storing 3 element
		arr[0]=new int[3];
		//for outside array index 1, storing 2 element
		arr[1]=new int[2];
		//for initializing a jagged array elements
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//for printing
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				 System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		 
	}

}
