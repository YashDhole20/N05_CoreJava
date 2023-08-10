package org.tnsif.uncheckedException;
import java.util.*;
//Program to demonstrate finally block not executed using System.exit(0).
public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		//try block contains exceptional code
		try
		{	
			System.out.println(x/y);
			//when we use System.exit(0), then finally block does not executed.
			//System.exit(0);
		}
		//catch block is used to handle ab exception
		catch(Exception e) {
			System.out.println("EXception handle"+e);
			//when we use System.exit(0), then finally block does not executed.
			//System.exit(0);
		}
		finally {
			//when finally block contains an exception then finally block does not executed.
			//System.out.println(4/0);
			System.out.println("finally block always run");
			System.out.println(4/0);
		}
	}

}
