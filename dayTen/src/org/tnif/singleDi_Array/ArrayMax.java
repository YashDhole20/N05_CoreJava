package org.tnif.singleDi_Array;
import java.util.*;
//Program to demonstrate on run-time array and to find out largest element in an array
public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of element in an array : ");
		int n=sc.nextInt();
		//array declaration 
		int arr[]=new int[n];
		//Array initialization
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Array elements are :");
		for(int i=0;i<n;i++) {
			 System.out.print(arr[i]+" ");
		}
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("\nThe largest element in an array is : "+max);
		//Array is a class and sort is the built in method
		Arrays.sort(arr);
		System.out.print(" Sorted  elements are :");
		for(int i=0;i<n;i++) {
			 System.out.print(arr[i]+" ");
		}
	}

}
