package org.tnif.singleDi_Array;
//program to demonstrate on array of objects
public class Employee {
	private int Id;
	private String name;
	private double salary;
	
	//parameterized constructor
	
	
	//getters and setters
	public int getId() {
		return Id;
	}
	 
	public Employee(int id, String name, double salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
