package com.kodewala.api.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String args[])
    {
    	List<Integer> list = Arrays.asList(100,200,200,400,400,700,300,500,300);
    	System.out.println(list);
    	
    	Set<Integer> duplicates = list.stream().filter(n->Collections.frequency(list,n)>1).collect(Collectors.toSet());
    	System.out.println("Diplicates Elements :"+duplicates);
   
    	
    	
    	Set<Integer> set = new HashSet<>();
    	Set<Integer> res = list.stream().filter(n->!set.add(n)).collect(Collectors.toSet());
    	
    	
    	System.out.println(res);
    	
   
    	
    }
}
