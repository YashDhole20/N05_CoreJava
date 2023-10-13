package org.tnsif.collection;
import java.util.*;
public class UserDefineListDemo {

	public static void main(String[] args) {
		 
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Yash", 100000f, "clerk01"));
		empList.add(new Employee(2, "Yaash", 50000f, "clerk02"));
		empList.add(new Employee(3, "aash", 30000f, "clerk03"));
		ArrayList<Emp> empListOne=new ArrayList<Emp>();
		empListOne.add(new Emp(102, "Yash", 100000f, "clerk01"));
		empListOne.add(new Emp(103, "Rushi", 50000f, "clerk02"));
		empListOne.add(new Emp(101, "Shiv", 30000f, "clerk03"));
		
		System.out.println(empList);
		Collections.sort(empList);
		System.out.println("--------------------------");
		System.out.println(empList);
		//Collections.sort(empList,new SortByName());
		
		
		
		Comparator<Emp> compOne= (e1,e2)->{return (int) (e1.getSalary()-e2.getSalary());};
		Collections.sort(empListOne,compOne);
		System.out.println(empListOne);
		System.out.println("---------------------------");
		
		
	}

}
