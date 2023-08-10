package org.tnif.MultiDimensionalArray;
import java.util.*;
public class TwoDimenstionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][2]; 
		//for initializing 
		//for user input
		System.out.println("Enter the array : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}

		}
		System.out.println("Array elements is : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
