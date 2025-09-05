package com.kodewala.exception.finaly;

// we handle multiple exception in catch block
public class Driver3 
{
   public static void main(String args[])
   {
	   String name = null;
	   String arr[] = {"M","o","n","u"};
	   try {
		   name.length();
		   System.out.print(arr[4]);
	   }
	   catch(NullPointerException | ArrayIndexOutOfBoundsException e)
	   {
		   System.out.println(e);
		   e.printStackTrace();
	   }
   }
}
