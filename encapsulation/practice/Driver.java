package com.kodewala.encapsulation.practice;


class BankAccount
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
	
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance += amount;
			System.out.println("Deposit amount: "+amount);
			System.out.println("Total Balance: "+balance);
		}
		else {
			System.out.println("Invalid balannce.");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount>0 && amount<= balance)
		{
			balance -= amount;
			System.out.println("Withdraw amount"+ amount);
			System.out.println("Balance Left: "+balance);
		}
		else {
			System.out.println("Insuffficiant balance:");
		}
		
	}
}
public class Driver 
{
  public static void main(String args[])
  {
	 BankAccount acc1 = new BankAccount(1000);
	 acc1.deposit(300);
	 acc1.withdraw(200);
  }
}
