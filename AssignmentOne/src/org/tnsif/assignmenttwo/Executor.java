package org.tnsif.assignmenttwo;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		 Products pro=new Products();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("1.Add \n2.Display \n.Exit");
		 while(true) {
			 System.out.println("Enter your choice : ");
			 int ch=sc.nextInt();
			 switch(ch) {
			 		case 1 :
			 			System.out.println("Enter the Product Name :");
			 			sc.nextLine();
			 			String product=sc.nextLine();
			 			pro.addProductTList(product);
			 			break;
			 		case 2: 
			 			pro.displayProductList();;
			 			break;
			 		case 3: System.exit(0);
			 		default:
			 			 System.out.println("Invalid Choice....");
			 }
		 }
	}

}
