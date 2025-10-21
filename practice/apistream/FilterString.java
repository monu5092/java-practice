package com.kodewala.practice.apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
   public static void main(String args[])
   {
	   List<String> list = Arrays.asList("Aman","Monu","Rahul","Ansh","Ankit","Sangam","Nitish");
	   
	   List<String> ans = list.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
	   System.out.println(ans);
	   
	   //list.stream().filter(s->s.startsWith("A")).forEach(n->System.out.print(n+" "));

   }
}
