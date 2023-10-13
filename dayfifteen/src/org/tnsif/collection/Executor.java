//Program to demonstrate Heterogeneous list
package org.tnsif.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Executor {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		 
		@SuppressWarnings("rawtypes")
		List listOne=new ArrayList();
		listOne.add(2);
		listOne.add(20);
		listOne.add(true);
		listOne.add(3.14f);
		listOne.add("Hello");
		listOne.add(new String("Hi"));
		 
		System.out.println(listOne);
		
		//ClassCastExecetion
		Collections.sort(listOne);
	}

}
