package com.kodewala.encapsulation;

public class BankAccount 
{
   private double balance;
   
   public BankAccount(double _balance)
   {
	   this.balance = _balance;
   }
   
   public double getBalance()
   {
	   return balance;
   }
   
   public void deposite(double amount)
   {
	   if(amount>0)
	   {
		   balance += amount;
		   System.out.println("Deposite "+amount);
	   }
	   else {
		   System.out.println("Invalid amount");
	   }
   }
   public void withdraw(double amount)
   {
	   if(amount >0 && amount<= balance)
	   {
		   balance -= amount;
		   System.out.println("Withdraw "+ amount);
	   }
	   else {
		   System.out.println("Insufficient balance");
	   }
   }
}
