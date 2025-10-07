package com.kodewala.practice.api.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameWithSpecificLetter {
  public static void main(String arg[])
  {
	  List<String> list = Arrays.asList("Amit","Rahul","Ankush","Anshu","Monu","Sambit");
	  
	  List<String> ans = list.stream().filter(name->name.startsWith("A"+" ")).collect(Collectors.toList());
	  
	  System.out.print(ans+" ");
	  
  }
}
