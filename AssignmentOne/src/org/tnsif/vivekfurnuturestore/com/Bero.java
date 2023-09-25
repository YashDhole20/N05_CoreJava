package org.tnsif.vivekfurnuturestore.com;

public abstract class Bero {
	protected String beroType;
	protected String beroColor;
	protected double price;
	
	public abstract void calculatePrice();
	public Bero(String beroType,String beroColor) {
		super();
		this.beroColor=beroColor;
		this.beroType=beroType;
	}
	public String getBeroType() {
		return beroType;
	}
	public void setBeroType(String beroType) {
		this.beroType = beroType;
	}
	public String getBeroColor() {
		return beroColor;
	}
	public void setBeroColor(String beroColor) {
		this.beroColor = beroColor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	 
	
}
