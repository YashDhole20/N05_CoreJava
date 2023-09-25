package org.tnsif.vivekfurnuturestore.com;

public class WoodenBero extends Bero{

	private String woodenType;
	
	 
	
	public WoodenBero(String beroType, String beroColor,String woodenType) {
		super(beroType, beroColor);
		this.woodenType=woodenType;
	}
	 

	public String getWoodenType() {
		return woodenType;
	}

	public void setWoodtype(String woodenType) {
		this.woodenType = woodenType;
	}
	 
	public void calculatePrice() {
		if( woodenType.equals("PlyWood")) {
			 price=15000;
		}
		if( woodenType.equals("TeakWood")) {
			 price=12000;
		}
		if(woodenType.equals("EngineeredWood")) {
			 price=10000;
		}
		
		
	}
}
