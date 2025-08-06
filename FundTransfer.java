package com.kodewala.Oop.Encapsulation;

public class FundTransfer {

	private int balance; 
    private String pin; 


    public void doCredit(int amountToBeTransferred)
    {
	if (amountToBeTransferred > 0)
	{
	    balance = balance + amountToBeTransferred;
	} else
	{
	    System.err.println(" Pls enter positive amount");
	}
    }

    public void doDebit(int amountToBeDebited)
    {
	if (amountToBeDebited <= balance)
	{
	    balance = balance - amountToBeDebited;
	} else
	{
	    System.err.println(" Pls enter positive amount");
	}
    }
}
