package org.tnsif.genericclass;
// Program to demonstrate Generic CLass
public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repo<Integer> obj=new Repo<Integer>();
		obj.setData(10);
		System.out.println(obj.getData());
		
		
		Repo<String> objOne=new Repo<String>();
		objOne.setData("Yash" );
		System.out.println(objOne.getData());
		
		Repo<Student> objTwo=new Repo<Student>();
		objTwo.setData(new Student(1, "Yash",67.00));
		System.out.println(objTwo.getData());
		
		
	}
	
}
