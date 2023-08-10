package org.tnif.singleDi_Array;
import java.util.*;
public class AssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the element numbers in array : ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int sol[]=new int[n];
		System.out.println("Enter the element in array : ");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		 
		
		for(int i=0;i<n;i++) {
			int ss=1;
			for(int j=0;j<n;j++) {
				if(j!=i) {
					ss=ss*arr[j];
				}
			}
			sol[i]=ss;
		}
		System.out.println("The solution  array is :");
		for(int i=0;i<n;i++) {
			System.out.print(sol[i]+" ");
		}
	}

}
