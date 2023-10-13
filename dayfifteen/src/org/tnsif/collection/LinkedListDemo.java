package org.tnsif.collection;
  
import java.util.Collections;
import java.util.LinkedList;
//import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		 LinkedList<String> strList=new LinkedList<String>();
		 strList.add("Rupesh");
		 strList.add("Malpani");
		 strList.add("Rushi");
		 strList.add("Pranav");
		 strList.add("Lalit");
		 
		 System.out.println(strList);
	
		 strList.addFirst("Avinash");
		 System.out.println(strList);
		 
		 strList.addLast("Devank");
		 System.out.println(strList);
		 System.out.println("First Element : "+strList.getFirst());
		 System.out.println("Last Element : "+strList.getLast());
		 
		 System.out.println("Remove  Element at 3 : "+strList.remove(3));

		 System.out.println("  Devank remove "+strList.remove(" Devank"));

		 System.out.println(strList);
		 Collections.sort(strList);
		 System.out.println("------------------------------------");
		 
		 ListIterator<String> listit=strList.listIterator();
		 
		 while(listit.hasNext()) {
			 
			 System.out.print(listit.next().toUpperCase()+" ");
		 }
		 System.out.println(strList);
		System.out.println("--------------------------"); 
		 while(listit.hasPrevious()) {
			 String name=listit.previous();
			 System.out.print(listit.previous().toLowerCase()+" ");
			 if(name.equals(" Lalit")) {				 
				 listit.add("yyy");
			 }
			 if(name.equals("Avinash"))
				 listit.remove();
			 if(name.equals("Rupesh"))
				 listit.add("Rupali");
		 }
		 //To get the length or size of the List..
		 System.out.println(strList.size());
		 System.out.println(strList);
		 
	}

}
