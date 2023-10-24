package org.tnsif.genericfuction;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {50,13,14,15,16};
		String s[]= { "Python","Java","C++","C"};
		Float f[]= {12.10f,52.01f,15.02f,2.01f};
		
		ArrayOperations.display(a);
		ArrayOperations.display(s);
		ArrayOperations.display(f);
		ArrayOperations.sortArray(a);
		ArrayOperations.display(a);
		
		Student st[] =new Student[] { new Student(1, "abc", 64.00),new Student(2, "def",50.22),new Student(3, "defd",50.122),new Student(4, "degf",501.22),new Student(5, "ddef",57.22)};
		System.out.println();
		ArrayOperations.display(st);
		
		
	}

}