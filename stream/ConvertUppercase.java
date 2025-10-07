package com.kodewala.practice.api.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUppercase {
   public static void main(String args[])
   {
	   List<String> list = Arrays.asList("Banglore","Hyderabad","Mysore","Guntur","Tenali");
	   System.out.println(list);
	   
	   List<String> uperCase = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	   System.out.println(uperCase);
	   
	    list.stream().map(s->s.toLowerCase()).forEach(s->System.out.print(s+" "));
	   
   }
}
