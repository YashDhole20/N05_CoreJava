package org.tnsif.collection;

import java.util.Comparator;

public class Emp //implements Comparable<Employee>{
{
	private int empId;
	private String empName;
	private float salary;
	private String desgination;
	
	public Emp() 
	{
		super();
	}
	public Emp(int empId, String empName, float salary, String desgination) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.desgination = desgination;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", desgination="
				+ desgination + "]";
	}
	
	
	 
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		//return (int)(getSalary()-o.getSalary());
//		
//		return getEmpName().compareTo(o.getEmpName());
//	}
	
}
class SortByName implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return(o1.getEmpName().compareTo(o2.getEmpName()));
	} 
	
}
class SortByDegination implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return(o2.getDesgination().compareTo(o1.getDesgination()));
	} 
	
}
