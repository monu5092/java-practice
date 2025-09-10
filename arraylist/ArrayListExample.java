package com.kodewala.collection.arraylist;

import java.util.ArrayList;

public class ArrayListExample 
{
   public static void main(String args[])
   {
	   ArrayList<String> companies = new ArrayList<>();
	   companies.add("Amazon");
	   companies.add("kodewala");  // Ordered
	   companies.add("kodewala");  // Allow Duplicate
	   companies.add(null);        // Allow Multiple null
	   companies.add("oracle");    // Index Based
	   companies.add("swiggy");    // Dynamic memory Allocation
	   companies.add(null);
	   
	   System.out.println("length: "+companies.size());
	   //System.out.println(companies[5]);  its give Unresolved compilation problem
	   System.out.println(companies.get(5));
	   //System.out.println(companies.get(8));
	   companies.add(3,"Boeing");
	   System.out.print(companies);
	   
	   
   }
}
