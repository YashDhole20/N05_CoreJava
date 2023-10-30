package org.tnsif.stramapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strList=Arrays.asList("Nashik","Mumbai","Pune","Nagpur","Malegaon");
		System.out.println("List of cities is "+strList);
		
		//retrieve the stream
		Stream<String> stream=strList.stream();
		
		//counting the empty strings
		long count =StreamFunction.countEmptyString(stream);
		System.out.printf("List %s has %d empty strings\n" ,strList, count);
		// System.out.println("List "+strList+" has "+count+" empty strings");
		
		
		//Counting String with length more than 8
		
		count =StreamFunction. countString(strList.stream(),8);
		System.out.printf("List %s has %d strings of length more than 8\n",strList,count);
		
		
		///Remove all empty strings from list
		
		List<String> filteredList = StreamFunction.nonEmptyStringList(strList.stream());
		System.out.printf("Original List : %s, List without Empty Strings : %s \n", strList, filteredList);

		// Strings with length more than 6
		filteredList = StreamFunction.getStrings(strList.stream(), 6);
		System.out.printf("Original List : %s, Cities length more than 6: %s %n", strList, filteredList);

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, -4);
		// retrieve the stream
		Stream<Integer> stream1 = numbers.stream();

		// List of square of all distinct numbers
		List<Integer> filteredNumberList = StreamFunction.getSquareList(stream1);
		System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, filteredNumberList);

		// Get count, min, max, sum, and average for numbers
		StreamFunction.showStatistics(numbers.stream());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
