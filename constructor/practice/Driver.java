package com.kodewala.constructor.practice;


class SuperAdmin
{
	String name;
	
	SuperAdmin(String _name)
	{
		this.name = _name;
		System.out.print("SuperAdmin");
	}
}

class Admin extends SuperAdmin
{

	int amount;
	Admin(String _name) {
		super("ABC");
		// TODO Auto-generated constructor stub
	}
	
	public Admin(String name,int amount)
	{
		super(name);
		this.amount = amount;
		System.out.println(name);
		System.out.println(amount);
	}
	
}

public class Driver 
{
   public static void main(String args[])
   {
	   Admin ad = new Admin("Abc",1500);
   }
}
