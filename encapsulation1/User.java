package com.kodewala.encapsulation1;

public class User 
{
	 public static void main(String args[])
	   {
		   ATM atm = new ATM();
		   
		   //atm.balance = 12000 ;// not allowed access  Directly.This is encapsulated
		   
		   atm.deposite(120,"1234");
		   atm.withdraw(200, "1234");
		   
	   }
}
