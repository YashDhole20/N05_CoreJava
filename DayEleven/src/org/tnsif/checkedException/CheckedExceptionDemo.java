package org.tnsif.checkedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args)   { //throws FileNotFoundException
		// TODO Auto-generated method stub
		try {
		FileInputStream f=new FileInputStream("C:\\Users\\Yash_IT\\Documents\\yash.txt");
		System.out.println("File has found");
		}
		catch(FileNotFoundException e) {
			System.out.println("File is not exist " +e);
		}
	}

}
