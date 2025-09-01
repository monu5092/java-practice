package com.kodewwala.marker;

public class Driver 
{
   public static void main(String args[]) throws CloneNotSupportedException
   {
	  Employee e1 = new Employee("KodeWala",123);
	  
	  Employee e2 = (Employee) e1.clone();
	  
	  System.out.println(e2.name);
	  System.out.print(e2.id);
	  
   }
}
