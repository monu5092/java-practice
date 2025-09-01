package com.kodewwala.marker;

public class Employee implements Cloneable
{
	public String name;
	public int id;
	
	public Employee(String name , int id)
	{
		this.name = name;
		this.id = id;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
