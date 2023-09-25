package org.tnsif.vivekfurnuturestore.com;

public class CustomerDetails {
	private String customerName;
	private String address;
	private long phoneNumber;
	
	
	
	public CustomerDetails(String customerName,long phoneNumber,String address) {
		super();
		this.customerName=customerName;
		this.phoneNumber=phoneNumber;
		this.address=address;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "CustomerDetails [customerName=" + customerName + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ "]";
	}
	
}
