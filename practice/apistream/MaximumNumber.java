package com.kodewala.practice.apistream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumNumber {
  public static void main(String args[])
  {
	  List<Integer> list = Arrays.asList(2,6,7,10,20,55,99,100);
	  
	  int maximumNumber = list.stream().max((a,b)->a.compareTo(b)).get();
	  System.out.println("Maximum Number: "+maximumNumber);
	  
	  int smax = list.stream().sorted(Comparator.reverseOrder()).skip(1).max((a,b)->a.compareTo(b)).get();
	  System.out.println(smax);
	  
  }
}
