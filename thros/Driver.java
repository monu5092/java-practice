package com.kodewala.exception.thro.thros;

public class Driver 
{
   public static void main(String args[])
   {
	   try {
		   String name  = null;
		   if(name == null)
		   {
			   throw new NullPointerException("Name value is null");
		   }
		   System.out.println(name.length());
	   }
	   catch(NullPointerException e)
	   {
		   e.printStackTrace();
	   }
   }
}
