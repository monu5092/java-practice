package com.kodewala.exception.thro.thros;

public class ThrowVsThrows 
{
   public static void main(String args[])
   {
	   ThrowVsThrows throwvsthrows = new ThrowVsThrows();
	   
	   try
		{
		   throwvsthrows.pay(null, null, 500, 1000);
		} catch (InsufficientBalanceException e)
		{
		    e.printStackTrace();
		}
	}
   
   
   public void pay(String account, String pin,int balance, int amountToBeTransformed)
     throws InsufficientBalanceException
   {
	   if(balance < amountToBeTransformed)
	   {
		   throw new InsufficientBalanceException("User does not have Enough fund");
		   //
	   }
   }
}
