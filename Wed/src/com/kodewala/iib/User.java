package com.kodewala.iib;

public class User {
  
	// SIB
	static 
	{
		System.out.println("in SIB");
	}
	
	// IIB
	{
		System.out.println("in IIB");
	}
	
	public User()
	{
		// 1st super will call
		// 2nd IIB call
		// Rest of the Logic call
		System.out.println("Rest of the logic");
	}
	
	
	public static void main(String args[])
	{
		User user = new User();
		User user1 = new User();
	}
}
