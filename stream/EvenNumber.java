package com.kodewala.practice.api.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber{
   public static void main(String args[])
   {
	   List<Integer> list = Arrays.asList(3,6,2,10,55,24,94,100);
	   
	    list.stream().filter(n->n%2==0).sorted().forEach(n->System.out.print(n+" "));
	   
   }
}
