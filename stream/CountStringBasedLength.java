package com.kodewala.practice.api.stream;

import java.util.Arrays;
import java.util.List;

public class CountStringBasedLength {
	public static void main(String args[])
	{
		List<String> list = Arrays.asList("Banglore","Hyderabad","Mysore","Guntur","Tenali");
		
	   int ans = (int) list.stream().filter(s->s.length()>5).count();
	    
	    System.out.println("CountStringBasedLength : "+ans);	    
		
	}
}
