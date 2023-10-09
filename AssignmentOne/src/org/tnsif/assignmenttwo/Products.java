package org.tnsif.assignmenttwo;
import java.util.*;
public class Products {
	 
	List<String> proList= new ArrayList<>();

	public List<String> getProList() {
		return proList;
	}

	public void setProList(List<String> proList) {
		this.proList = proList;
	}
	
	public void addProductTList(String product) {
		proList.add(product);
	}
	
	public void displayProductList() {
		Collections.sort(proList);
		System.out.println("Product are "+proList);
	}
}
