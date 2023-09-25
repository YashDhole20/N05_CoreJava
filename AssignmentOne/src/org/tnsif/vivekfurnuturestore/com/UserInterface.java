package org.tnsif.vivekfurnuturestore.com;
import java.util.*;
public class UserInterface   {

	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String customerName;
		 String address;
		 String beroType;
		 long phoneNumber;
		 System.out.println("Enter Customer Name : ");
		 customerName=sc.nextLine();
		 System.out.println("Enter Phone Numer : ");
		 phoneNumber=sc.nextLong();
		 System.out.println("Enter the address : ");
		 address=sc.next();
		 System.out.println("Enter the Bero Type : ");
		 beroType=sc.next();
		 
		 CustomerDetails cd=new CustomerDetails(customerName, phoneNumber, address);
		 if(beroType.equals("SteelBero")) {
			  
			  System.out.println("Enter the BeroColor :");
			  String beroColor=sc.next();
			  System.out.println("Enter Bero Heigth : ");
			  int beroHeight=sc.nextInt();
			  Bero b=new SteelBero(beroType, beroColor, beroHeight);
			  b.calculatePrice();
			  Discount dis=new Discount();
			  System.out.println("Amount needs to be paid :"+ (b.getPrice()-dis.calculateDiscount(b)));
				 
			  
		 }
		 else if(beroType.equals("WoodenBero")) {
			  
			 System.out.println("Enter the BeroColor :");
			 String beroColor=sc.next();
		     System.out.println("Enter Wood Type : ");
			 String woodenType=sc.next();
			 Bero b=new WoodenBero(beroType, beroColor, woodenType);
			 b.calculatePrice();
			 Discount dis=new Discount();
			 System.out.println("Amount needs to be paid :"+ (b.getPrice()-dis.calculateDiscount(b)));
			 
		 }
		 else {
			 System.out.println(beroType+"is an invalid berotype");
		 }
	}
 
}
