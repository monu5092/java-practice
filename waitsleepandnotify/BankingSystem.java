package com.koodewala.thread.waitsleepandnotify;

class Bank
{
	 int balance = 1000;
	
	public synchronized void deposit(int amount)
	{ 
		System.out.println("Total Balance : "+balance);
		balance += amount;
	}
	public  synchronized void withdraw(int amount)
	{
		System.out.println("Total Balance : "+balance);
		if(balance>=amount)
		{
			balance -= amount;
		}
	}
	public synchronized updateAccount() {
		
	}
}

public class BankingSystem {

}
