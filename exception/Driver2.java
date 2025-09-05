package com.kodewala.exception;

public class Driver2 
{
  public static void main(String args[])
  {
	  String products[] = {"apple","lg","samsung"};
	  
	  try
	  {
		  String prod  = products[5];
		  String name = null;
		  name.length();
		  int amount = 10/0;
	  }
	  catch(NullPointerException e)
	  {
		  e.printStackTrace();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
}
