package com.kodewala.practice.api.stream;

import java.util.Arrays;
import java.util.List;

public class ElementSum {
   public static void main(String args[])
   {
	   List<Integer> list = Arrays.asList(5,2,9,7,22,7,30,24,56,5,100);
	   
	   int sum = list.stream().mapToInt(n->n).sum();
	   
	   System.out.print("Sum of the Element : "+sum);
	   
   }
}
