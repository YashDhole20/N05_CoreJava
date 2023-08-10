package org.tnsif.uncheckedException;
import java.util.*;
//program to demonstrate ArithmeticException
public class ArithmeticExceptionExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		//try block contains exceptional code
		try
		{	
			System.out.println(x/y);
		}
		//catch block is used to handle an exception
		catch(Exception e) {
			System.out.println("EXception handle"+e);
		}
		
	}

}
