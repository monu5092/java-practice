package com.kodewala.exception.thro.thros;

class InvalidAgeException extends Exception
{

	public InvalidAgeException(String message) {
		super(message);
	}
}

public class UserDefinedException 
{
	static void checkAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age is less than 18 not valid");
		}
		else {
			System.out.println("You are eligible for vote");
		}
	}
   public static void main(String args[])
   {
	  try {
		  checkAge(15);
	  }
	  catch(InvalidAgeException e)
	  {
		  System.out.println(e.getMessage());
	  }
	  System.out.print("Program continue after handling exception.");
   }
}
