package com.kodewala.encapsulation1;

public class ATM 
{
	private double balance = 1000.0;
	  private String pin = "123";
	  
	  public void withdraw(double amountToWithdraw,String enterPin)
	  {
		  System.out.println("Current Balance : "+ balance);
		  if(enterPin.equals(pin) && amountToWithdraw <= balance)
		  {
			  balance = balance- amountToWithdraw;
			  System.out.print("Balance Post Withdraw : "+ balance);
		  }
		  else {
			  System.out.print("Error: Incorrect PIN or insufficient funds. ");
		  }
	  }
	  public  void deposite(double amount,String enterPin)
	  {
		  if(enterPin.equals(pin))
		  {
			  balance = balance + amount;
			  System.out.print("₹ "+ amount +" deposited. New ballance : ₹" + balance);
		  }
		  else {
			  System.out.println("Error : Incorrect PIN. ");
		  }
	  }
}
