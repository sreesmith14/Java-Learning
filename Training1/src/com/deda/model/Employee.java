package com.deda.model;

import java.io.Serializable;
import java.util.Comparator;

//POJO -= Plain Old Java Object
public class Employee implements Serializable,Comparable<Employee>{

	private int eno;
	private String ename;
	public Employee()
	{
		System.out.println("From Employee Construct");
	}
	public Employee(int eno,String ename)
	 {		 
		this.eno =eno;
		this.ename = ename;
	 }
	public int getEid() {
		return eno;
	}

	public void setEid(int eid) {
		this.eno = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eno + ", ename=" + ename + "]";
	}
	
	public int compareTo(Employee e) {
		
		return this.eno - e.eno;
	
	}
	
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			//return e1.getEid() -e2.getEid();
			return e1.getEname().compareTo(e2.getEname());
		}
	
	
	};

}
