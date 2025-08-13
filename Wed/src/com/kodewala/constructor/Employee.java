package com.kodewala.constructor;

public class Employee 
{
     String name;
     String id;
     
     public Employee()
     {
    	 System.out.println("This is Employee Class.");
     }
     
     public Employee(String _name,String _id)
     {
    	 this.name = _name;
    	 this.id = _id;
    	 
    	 System.out.println("Employee Name : "+name);
    	 System.out.println("Employee ID : "+ id);
     }
}
