package org.tnsif.genericfuction;

import java.util.Arrays;

public class ArrayOperations   {
 
	public static<E> void display(E values[]) {
		/*
		 * for(int i=0;i<values.length;i++) {
		 * 
		 * }
		 */
		for(E ele :values) {
			System.out.print(ele+" ");
		}
	}
	public static <E extends Number> void sortArray(E values[]) {
		Arrays.sort(values);
	}
}
