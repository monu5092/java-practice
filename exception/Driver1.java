package com.kodewala.exception;

public class Driver1 
{
   public static void main(String args[])
   {
	   System.out.println("Proced started...");
	   String name = null;
	   
	//   System.out.print(Class.forName("com.kodewala.exception.Driver");
	  	
	   
	   try
	   {
		   Class.forName("com.kodewala.exception.Driver");
	       System.out.print(name.length());
	   }
	   catch(ClassNotFoundException e)
	   {
		   e.printStackTrace();
	   }
	   catch(Exception e)
	   {
		   System.out.print("String is null");
	   }
	   System.out.println("Proceed is Ended");
   }
}
