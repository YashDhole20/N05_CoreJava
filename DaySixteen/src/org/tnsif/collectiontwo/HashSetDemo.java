package org.tnsif.collectiontwo;
import java.util.*;
public class HashSetDemo {
// Store only unique elements
//this unorder unsorted set
	public static void main(String[] args) {
		
		HashSet<String> course=new HashSet<String>();
		course.add("Engineering");
		course.add("MBA");
		course.add("MCa");
		course.add("Pharmacy");
		course.add("Engineering");
		System.out.println(course);
		System.out.println(course.size());
		
		System.out.println("Using iterator");
		Iterator<String> it=course.iterator();
		while(it.hasNext()) {
			System.out.print(it.next().toUpperCase()+" ");
		}
		System.out.println(course.remove("MBA")?"\nElement removed":"\n Not Removed");
		
		
		HashSet<Integer> hs=new HashSet<Integer>();
		//add() return type is boolean. when any type of data(null also) is added in set then its return true.
		System.out.println(hs.add(10)); 
		hs.add(50);
		hs.add(40);
		hs.add(90);
		hs.add(60);
		hs.add(50);//contain unique value.  
		//Return FALSE because of 10 already present in set .
		System.out.println(hs.add(10));
		
		HashSet<Integer> hsOne= new HashSet<>();
		hsOne.add(54);
		hsOne.add(46);
		hsOne.add(97);
		hsOne.add(61);
		hsOne.add(53);
		System.out.println("First Set :"+hs);
		System.out.println("Second Set :"+hsOne);
		
		//Union of two set
		hs.addAll(hsOne);
		System.out.println("After add 2nd set into 1st : "+ hs);
		
		hs.clear();
		System.out.println(hs);//hs is empty
		hs.add(10);
		hs.add(53);
		hs.add(54);
		hs.add(90);
		hs.add(60);
		
		System.out.println("First Set :"+hs);
		System.out.println("Second Set :"+hsOne);
		
		//Set Difference a-b
		hs.removeAll(hsOne);
		System.out.println("After remove all element");
		System.out.println("First Set :"+hs);
		System.out.println("Second Set :"+hsOne);
		hs.clear();
		
		hs.add(10);
		hs.add(53);
		hs.add(54);
		hs.add(90);
		hs.add(60);
		
		//Intersection
		hs.retainAll(hsOne);
		System.out.println("After the intersection of two set :");
		
		System.out.println("First Set :"+hs);
		System.out.println("Second Set :"+hsOne);
		
		//for sorting convert in list then sort it
		List<Integer> list=new ArrayList<Integer>(hsOne);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
