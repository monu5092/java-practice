package com.kodewala.practice.api.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLength {
   public static void main(String args[])
   {
	   List<String> list = Arrays.asList("Banglore","Hyderabad","Mysore","Guntur","Tenali");
	   
	   Map<Integer,List<String>> grouped = list.stream().collect(Collectors.groupingBy(s->s.length()));
	   
	   System.out.println(grouped);
   }
}
