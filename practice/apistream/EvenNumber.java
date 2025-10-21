package com.kodewala.practice.apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
  public static void main(String args[])
  {
	  List<Integer> list = Arrays.asList(2,5,7,9,13,14,100,220);
	  
	  List<Integer> ans = list.stream().filter(n->n%2==0).collect(Collectors.toList());
	          //ans.forEach(n->System.out.print(n));
	  System.out.print(ans+" ");
	  
	   //list.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
	  
  }
}
