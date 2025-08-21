package com.kodewala.abstraction;


abstract class College
{
    public abstract void department();	
}

class Agriculture extends College
{
      public void department() {
    	  System.out.println("This is Agriculture Department.");
      }
}
public class Driver {
	
	public static void main(String args[])
	{
		Agriculture ag = new Agriculture();
		ag.department();
	}

}
