package com.kodewala.encapsulation.practice;


class ATM
{
	private double balance=1000.0;
	private String pin = "1234";
	
	public void deposite(String enteredPin,double amount)
	{
		System.out.println("Current balance: "+balance);
		if(enteredPin.equals(pin) && amount>0)
		{
			balance += amount;
			System.out.println("Deposit amount: "+amount);
			System.out.println("Total balance: "+balance);
		}
		else {
			System.out.print("Inavlid Pin");
		}
	}
	
	public void withdraw(String enteredPin,double amount)
	{
		if(enteredPin.equals(pin) && amount<= balance)
		{
			balance -= amount;
			System.out.println("Withdraw balance: "+amount);
			System.out.println("Total Balance: "+ balance);
		}
		else {
			System.out.println("Invalid pin.");
		}
	}
}
public class Driver1 
{
   public static void main(String args[])
   {
	   ATM acc = new ATM();
	   acc.deposite("1234", 1000);
	   acc.withdraw("1234", 800);
   }
}
