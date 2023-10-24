package org.tnsif.collectiontwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//  Store data in-order which we store
		LinkedHashSet<String> cities=new LinkedHashSet<String>();
		cities.add("Nashik");
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Nagpur");
		cities.add("Malegaon");
		System.out.println(cities);
		
		//sort linkedHastSet element
		List<String> list=new ArrayList<String>(cities);
		Collections.sort(list);
		System.out.println(list);
		
		cities=new LinkedHashSet<String>(list);
		System.out.println(cities);
		
	}

}
