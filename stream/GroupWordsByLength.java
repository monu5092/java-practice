package com.kodewala.api.stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupWordsByLength 
{
    public static void main(String args[])
    {
    	List<String> list = Arrays.asList("Banglore","Mumbai","Hyderabad","Delhi","Manglore");
    	
    	Map<Integer, List<String>> grouped = list.stream().collect(Collectors.groupingBy(s -> s.length()));
    	
    	System.out.println(grouped);
    	
    	
    }
}
