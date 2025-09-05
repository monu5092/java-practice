package com.kodewala.exception;

public class Driver 
{
    public static void main(String args[])
    {
    	String arr[] = {"M","O","N","u"};
    	
    	int i = 10;
    	//System.out.print(arr[5]);
    	
    	try {
    		int j = i/0;
    		String name = null;
    		String prod = arr[4];
    		name.length();
    		 
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
//    	it will not accessible because Exception hierarchy not maintain from child to parents
    	
//    	catch (ArrayIndexOutOfBoundsException e)
//    	{
//    		e.printStackTrace();
//    	}
//    	catch(ArithmeticException e)
//    	{
//    		e.printStackTrace();
//    	}
    	  
    }
}
