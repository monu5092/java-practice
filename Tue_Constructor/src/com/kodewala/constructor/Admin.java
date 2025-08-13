package com.kodewala.constructor;

public class Admin extends SuperAdmin{

	int amount;
    public Admin(String name)
    {
   	 super("ABC");
    }
    
    public Admin(String name,int amount)
    {
   	super(name);
   	this.amount = amount;
   	System.out.println(name);
   	System.out.println(amount);
    }
    
   
}
