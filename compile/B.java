package com.kodewala.compile;

public class B  extends A 
{
  public  void sayHi()
  {
   System.out.println("Inside b");
  }
  
  public static void main(String args[])
  {
	  A a = new B();
	  a.sayHi();
  }
  // its give compile time error 
  
  // Implicit super constructor A() is undefined for default constructor. Must define an explicit constructor

}
