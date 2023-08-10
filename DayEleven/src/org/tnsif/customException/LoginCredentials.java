package org.tnsif.customException;

//program t demonstrate on user-defined exception
public class LoginCredentials  extends Exception{
	
	//private data member
	private String str;
	//getter and setter
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	//parameterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	} 
	
	

}
