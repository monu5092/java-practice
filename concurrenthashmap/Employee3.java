package com.kodewala.concurrenthashmap;

public class Employee3 {
	
	String name;
	double salary;
	
	Employee3(String _name,double _salary)
	{
		this.name = _name;
		this.salary = _salary;
	}

	 @Override
	    public String toString() {
	        return "Employee{name='" + name + "', salary=" + salary + "}";
	    }
}
