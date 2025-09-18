package com.kodewala.treeset;

import java.util.TreeSet;

class Employee implements Comparable<Employee>
{
    String name;
    
    Employee(String _name)
    {
    	this.name = _name;
    }
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}

public class TreeSetExample 
{
   public static void main(String args[])
   {
	   TreeSet<String> treeSet = new TreeSet<String>();
	   
	   treeSet.add("Nanada Kumar");
	   treeSet.add("Anoop Kumar");
	   treeSet.add("Rahul");
	   treeSet.add("Aakash");
	   treeSet.add("Aakash");
	   treeSet.add("Bittu");
//	   treeSet.add(null);
//	   System.out.println(treeSet);
	   
	   TreeSet<Employee>employeeSet = new TreeSet<>();
	   employeeSet.add(new Employee("Monu"));
	   employeeSet.add(new Employee("Ankit"));
	   employeeSet.add(new Employee("Patro"));
	   System.out.println(employeeSet);
	   
	}
}