package com.kodewala.polymorphism.compiletime;

class Payment
{
	public void processPaymet(int amount, String currency)
	{
		System.out.println("Payment process through cash (int amount, String currency).");	
	}
	
	public void processPayment(double amount,String card, String expiry)
	{
		System.out.println("Payment process through card (double amount,String card,String expiry)");
	}
	
	public void processPayment(double amount, String upiId)
	{
		System.out.println("Payment process through UPI (double amount, String upiId)");
	}
}

public class Driver 
{
   public static void main(String args[])
   {
	   Payment payment = new Payment();
	  // payment.processPayment(100,"Rupees");
	   payment.processPayment(1000,"Debit","22/10");
	   //payment.processPayment(100,"8989988@ybl");
   }
}
