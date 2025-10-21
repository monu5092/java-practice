package com.kodewla.poymorphism.overloading.overiding;

class Payment
{
	void processPayment(double amount)
	{
		System.out.println("Processing generic payment of "+amount);
	}
}

class UPIPayment extends Payment
{
	@Override
	void processPayment(double amount)
	{
		System.out.println("Processing generic payment of "+amount);
	}
}

class CCPay extends Payment
{
	@Override
	void processPayment(double amount)
	{
		System.out.println("Processing generic payment of "+amount);
	}

}

public class PaymentSystem {
   public static void main(String args[])
   {
	   UPIPayment upi = new UPIPayment();
	   upi.processPayment(1000);
	   
	   CCPay cc = new CCPay();
	   cc.processPayment(2000);
			 
   }
}
