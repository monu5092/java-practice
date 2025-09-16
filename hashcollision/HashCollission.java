package com.kodewala.hashcollision;

import java.util.HashSet;

class Student 
{
	String name;
	
	public Student (String name)
	{
		this.name = name;
	}
	
//	public boolean equals(Student student)
//	{
//		return this.name.equals(student.name);
//	}
	
	public int hashCode()
	{
		return 12345;
	}		
}

public class HashCollission 
{
   public static void main(String args[])
   {
	   HashSet<Student> set = new HashSet<Student>(64);
	   set.add(new Student("s1"));
	   set.add(new Student("P2"));
	   set.add(new Student("P3"));
	   set.add(new Student("P4"));
	   set.add(new Student("P5"));
	   set.add(new Student("P6"));
	   
	   set.add(new Student("P7"));
	   set.add(new Student("P8"));
	   set.add(new Student("P9"));
	   set.add(new Student("P10"));
	   
	   //when collision happen it more than 8 time in set Triffiy linkedlist convert into Balnced Tree
	   
	   System.out.println("Set size is :"+set.size());
	  
   }
}
