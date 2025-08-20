package com.kodewala.polymorphism.runtime;

public class Driver 
{
   public static void main(String args[])
   {
	   Person p1 = new Person();
	   p1.walking();
	   
	   Person p2 = new Ajay();
	   p2.walking();
   }
}
