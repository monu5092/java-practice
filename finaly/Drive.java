package com.kodewala.exception.finaly;

// Implements Finally Block
public class Drive 
{
  public static void main(String args[])
  {
	  try
	  {
		 // System.out.println("try bloc start...");
		  String name = null;
		  name.length();
		  System.out.println("try bloc start...");
      }
	  catch(Exception e)
	  {
		  System.out.println("Name is null");
	  }
	  finally 
	  {
		 System.out.println("Finally block is initialized");  
	  }
  }
}
