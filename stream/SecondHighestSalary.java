package com.kodewala.api.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondHighestSalary{
   public static void main(String args[])
   {
	   List<Integer> list = Arrays.asList(30000,40000,70000,45000,50000,35000,50000);
	   
	  // Optional<Integer> ans = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	   
	  Integer res = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	   
	   System.out.println("Second Salary: "+res);
   }

}
