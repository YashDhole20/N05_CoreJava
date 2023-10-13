//Program to demostrate homogeneous ArrayList..
package org.tnsif.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		 List<Integer> intList=new ArrayList<Integer>();
		 
		 intList.add(12);
		 intList.add(32);
		 intList.add(52);
		 intList.add(44);
		 intList.add(1);
		 
		 intList.add(2,15);
		 System.out.println(intList);
		 System.out.println("is 12 present "+intList.contains(12));
		 System.out.println("is 44 present "+intList.contains(44));
		 System.out.println("Remove element at 5 : "+intList.remove(5));
		 //IndexOutOfBoundException
		 //System.out.println("Remove element at 5 : "+intList.remove(20));
		 System.out.println("Remove element  44 at "+intList.indexOf(44)+ " index : "+intList.remove(intList.indexOf(44)));
		 
		 System.out.println(intList.indexOf(52)>=0?" is present.":" is not present.");
		 //sort is the inbuild method in collections interface which static and default.
		 System.out.println("------------After Sorting Or Ascending------------");
		 Collections.sort(intList);
		 System.out.println(intList);
		 System.out.println("------------After Reversing Or Descending------------");
		 Collections.reverse(intList);
		 System.out.println(intList);
	
//		 intList.clear();
//		 System.out.println(intList);
		 System.out.println("-------------------------");
		 Iterator<Integer> it=intList.iterator();
		 while(it.hasNext()) {
			 int no=it.next();
			 System.out.print(no+" ");
		 }
				 
	}
}
