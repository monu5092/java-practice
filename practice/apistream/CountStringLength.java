package com.kodewala.practice.apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStringLength {
  public static void main(String args[])
  {
	  List<String> list = Arrays.asList("Aman","Monu","Ankush","Rahul");
	  
	  List<Integer> ans = list.stream().map(s->s.length()).collect(Collectors.toList());
	  System.out.println(ans);
	  list.stream().filter(s->s.length()>3).forEach(s->System.out.print(s+" "));
  }
}
