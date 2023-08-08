package org.tnsif.interfaceDemo;

public interface DebitCard {
	//by default all variables public static final and we initialize it
	long cardNo=123467;
	//we can't not define method body in interface
	//be default it's abstract
	void displayCardDetails();
	default void display() {
		//default method and static method is the new feature of java 8 inside an interface
		System.out.println("Default method...");
	}
	static void print() {
		System.out.println("Static method...");
	}
	
}
