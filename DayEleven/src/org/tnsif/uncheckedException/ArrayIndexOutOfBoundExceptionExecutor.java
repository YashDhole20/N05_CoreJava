package org.tnsif.uncheckedException;
//program to demonstrated Array index of bound exception
public class ArrayIndexOutOfBoundExceptionExecutor {
	
	static void print(int arr[]) {
		try {
			System.out.println(arr[4]);
		}
		catch(Exception e) {
			System.out.println("Exception handle "+ e);
		}
		finally {
			System.out.println("Finally block is always executed.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {12,13,15};
		int arr1[]= {12,15,4,15,45};
		print(arr);
		print(arr1);
		
	}

}
