package org.tnsif.businesslogic;

public class Operations {

	
	public static long getFactorial(int no)
	{
		
		long fact=1;
		if(no>=0) {
			for(int i=1;i<=no;i++) {
				fact=fact*i;
			}
		}
		else{
			return -1;
		}
		return fact;
		
	}
	public static boolean isPrime(int no) {
		 
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				return false;
			}
		}
		return true;
		
	}
	public  static   boolean isStringPalindrome(String s) {
		String rev=new StringBuffer(s).reverse().toString();
		if(s.equals(rev)) {
			return true;
		}
		else {
			return false;
		}		
	}
	public static boolean isNumberPalindrome(int no) {
		int  sum=0,temp=no;
		while(no>0) {
			sum=sum*10+no%10;
			no=no/10;
		}
		if(sum==temp)
			return true;
		else
			return false;
	}
}
