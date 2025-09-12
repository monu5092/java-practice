package com.kodewala.set;

import java.util.HashSet;

public class HashCodeExample 
{
   public static void main(String args[])
   {
	   HashSet<String> product = new HashSet<>();
	   
	   product.add("applle_12");
	   product.add("applle_15");
	   product.add("Samsung s20");
	   product.add("lg_23");
	   product.add("Motorolla");
	   product.add("applle_12");
	   
	   System.out.println(product);
	   
   }
}
