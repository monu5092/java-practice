package com.kodewala.inheritance;

public class CurrentAccount extends BankAccount{

	private double interestRate;
	public CurrentAccount(String accountHolder, double balance,double interestRate) {
		super(accountHolder, balance);
		this.interestRate=interestRate;
	}

	public  void displayAccountInfo() {
		System.out.println(accountHolder);
		System.out.println(balance);
		System.out.println(interestRate);
		
	}
}
