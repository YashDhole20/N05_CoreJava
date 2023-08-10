package org.tnsif.customException;
import java.util.*;

//Program to demonstrate on user-defined exception 
//driver class
public class CustomExceptionExecutor {

	public static void main(String[] args)   { //throws LoginCredentials
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email id and password");
		String email=sc.nextLine();
		String pass=sc.nextLine();
		try {
		if(email.equals("yashdhole") && pass.equals("pass@123")) {
			System.out.println("Credential matched");
		}
		else {
			throw new LoginCredentials("Invalid Credential.");
		}
		}
		catch(LoginCredentials e) {
			System.out.println(e);
		}
	}

}
