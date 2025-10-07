package com.kodewala.api.stream;

public class FirstNonRepeatingChar {
   public  static void main(String args[]) {
	   
	   String input = "Anoopam";
	    
	   
	   Character ch = input.chars().mapToObj(c->(char)c).filter(c->input.indexOf(c)==input.lastIndexOf(c)).findFirst()
			   .orElseThrow();
	   System.out.println("First repeating: "+ch);
	   
	   
	   Character ch1 = input.chars().mapToObj(c->(char)c).filter(c->input.indexOf(c)==input.lastIndexOf(c)).skip(1)
			   .findFirst().orElseThrow();
	   
	   System.out.println("Second repeating: "+ch1);
	   
   }
}
