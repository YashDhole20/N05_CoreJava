package org.tnsif.genericinterface;

public class Executor {

	public static void main(String[] args) {
		 
		String name[]= {"abc","pqr","xyz"};
		Integer no[]= {1,5,8,3,7,9};
		
		MinMaxImplement<Integer> intObj=new MinMaxImplement<Integer>(no);
		System.out.println("Minimum of int array is "+ intObj.getMinimum());
		System.out.println("Maximum of int array is "+intObj.getMaximum());
		
		MinMaxImplement<String> strObj=new MinMaxImplement<String>(name);
		System.out.println("Minimum of str array is "+strObj.getMinimum());
		System.out.println("Maximum of str array is "+strObj.getMaximum());
	}

}
