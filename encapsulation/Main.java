package com.kodewala.encapsulation;

public class Main 
{
    public static void main(String args[])
    {
    	BankAccount acc = new BankAccount(1000);
    	acc.deposite(500);
    	acc.withdraw(200);
    	System.out.println("Final balance: "+acc.getBalance());
    }
}
