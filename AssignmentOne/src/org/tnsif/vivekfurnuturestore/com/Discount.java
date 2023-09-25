package org.tnsif.vivekfurnuturestore.com;

public class Discount   {
	 
	public double calculateDiscount(Bero obj) {
		
		if (obj.getBeroType().equals("SteelBero") )
		 {
			 
			return (obj.getPrice()*10)/100;
		}
		else if (obj.getBeroType().equals("WoodenBero")){
			return (obj.getPrice()*15)/100;
		}
		else {
			return 0;
		}
		
	}
}
