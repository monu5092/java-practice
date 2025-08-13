package com.kodewala.constructor;

public class Manager extends Employee
{
	String department;
    public Manager()
    { 
    	super();
    	System.out.println("This is Manager class");
    }
    
    public Manager(String name,String id,String _department)
    {
    	super(name,id);
    	this.department = _department;
    	System.out.println("Employee Department "+department);
    	
    }
}
