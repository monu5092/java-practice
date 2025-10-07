package com.kodewala.practice.api.stream;

import java.util.Arrays;
import java.util.List;

public class SortedArray {
   public static void main(String args[])
   {
	   List<Integer> list = Arrays.asList(5,2,9,7,22,7,30,24,56);
	   
	   list.stream().distinct().sorted().forEach(n->System.out.print(n+" "));
   }
}
