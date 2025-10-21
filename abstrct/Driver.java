package com.kodewala.abstrct;

abstract class Account
{
	double balance;
	
	public Account(double _balance)
	{
		this.balance = _balance;
	}
	
	abstract void calculateInterest();
	void showBalance()
	{
		System.out.println("Current balance : "+balance);
	}
	
}
class SavingAccount extends Account
{
  	double interest = 5.8;
  	
  	public SavingAccount(double balance)
  	{
  		super(balance);
  	}

	@Override
	void calculateInterest() {
		// TODO Auto-generated method stub
		double totalInterest = (balance*interest)/100;
		balance += totalInterest ;
		System.out.println("Interest :=> "+ interest);
	}	
}

class CurrentAccount extends Account
{
    
	public CurrentAccount(double _balance) {
		super(_balance);
		
	}

	@Override
	void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("No interest for the current account.");
	}
	
}

public class Driver 
{
   public static void main(String args[])
   {
	   SavingAccount acc1 = new SavingAccount(1000);
	   acc1.calculateInterest();
	   acc1.showBalance();
	   
	   CurrentAccount acc2 = new CurrentAccount(1000);
	   acc2.calculateInterest();
	   acc2.showBalance();
   }
}
