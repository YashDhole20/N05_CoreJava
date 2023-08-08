package org.tnsif.interfaceDemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can't initiate interface
		SBIDebitCard ss=new SBIDebitCard();
		
		//print is static method inside an interface to call print method we hava to use interface name.methodName()
		DebitCard.print();
		ss.displayCardDetails();
		//we can call default method of an interface using obj
		ss.display();
		
		
		Person p=new Person();
		p.showDrinkName();
		
		CheesePopCorn cc=new CheesePopCorn();
		cc.displayReceipe();

	}

}
