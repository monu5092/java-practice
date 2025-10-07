package com.kodewala.practice.api.stream;

import java.util.Arrays;
import java.util.List;

public class Square {
  public static void main(String args[]) {
	  
	  List<Integer> list = Arrays.asList(2,8,5,7,10,4,3);
	  
	  list.stream().map(n->n*n).sorted().forEach(n->System.out.print(n+" "));
	  
  }
}
