package org.tnif.singleDi_Array;

public class ArrayExample {
	public static void main(String[]arg) {
		//decalration and initialize of array at compile time 
		int arr[]= {44,56,2,32,28};
		System.out.println("The array of 2nd index is: "+arr[2]);
		//To print all the values of an array
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
