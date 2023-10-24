package org.tnsif.lambdaexpression;

 

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube c=(no)->no*no*no;
		System.out.println(c.getCube(4));
		
		Operations obj;
		
		//Addition of two integer
		obj=(a,b)->{ return a+b;};
		System.out.println(obj.performArithmetic(10,20));

		//Subtraction of two integer
		obj=(a,b)->a-b;
		System.out.println(obj.performArithmetic(50, 11));
		
		//Multiplication of two integer
		obj=(a,b)->a*b;
		System.out.println(obj.performArithmetic(50, 11));
		
		//Division of two integer
		obj=(a,b)->a/b;
		System.out.println(obj.performArithmetic(50, 11));
		
		//Mod of two integer
		obj=(a,b)->a%b;
		System.out.println(obj.performArithmetic(50, 11));
	}

}
