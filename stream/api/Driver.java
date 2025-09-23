package com.kodewala.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver 
{
   public static void main(String args[])
   {
	 List<String> list = new ArrayList<>();
	 list.add("LG");
	 list.add("Samsung");
	 list.add("Sansui");
	 list.add("Sigma");
	 list.add("Godrej");
	 
	 System.out.println("input: "+ list);
	 
	 //1. Convert the list to stream object
	   Stream<String> stream = list.stream();
	   
	 //2. Apply the logic(filter the products which starts with 's')
	   Stream<String> filteredStream = stream.filter(p->p.startsWith("S")).map(w->w.toUpperCase());
	 
	 //3. Collect the data
	   List<String> outPutList = filteredStream.collect(Collectors.toList());
	   
	   System.out.println("Output: "+outPutList);
   }
}
