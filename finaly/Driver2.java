package com.kodewala.exception.finaly;

// Implements finally block
public class Driver2 
{
  public static void main(String args[])
  {
	  String name = null;
	  try
	  {
		  //1. Database Connection - opened
		  //2. Some Processing logics(50) 
		  //3. close the database
		  name = "Monu";
		  name.length();
		  System.out.println("Inside try");
	  }
	  catch(Exception e)
	  {
		  System.out.println("Inside catch");
	  }
	  finally
	  {
		  System.out.println("Inside finally");
	  }
  }
}
