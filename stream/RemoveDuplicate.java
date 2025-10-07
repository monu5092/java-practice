package com.kodewala.practice.api.stream;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
  public static void main(String args[])
  {
	  List<Integer> list = Arrays.asList(5,2,9,7,22,7,30,24,56,5);
	  System.out.println(list);
	  
	  list.stream().distinct().forEach(n->System.out.print(n+" "));
  }
}
