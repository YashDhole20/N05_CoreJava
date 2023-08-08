package org.tnsif.interfaceDemo;

public class Person implements Alcohol,ColdDrink{
 @Override
	public void showDrinkName() {
		System.out.println("Brand:"+brand+" "+"Alcohol name:"+alcohol+" "+"Drink name:"+name);
	}
}
