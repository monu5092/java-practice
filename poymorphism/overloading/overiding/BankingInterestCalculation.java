package com.kodewla.poymorphism.overloading.overiding;

class Bank
{
	double rateOfInterest()
	{
		return 0.0;
	}
	
	void calculateInterest(double principal,int years)
	{
		double interest = (principal * rateOfInterest()*years)/100;
		System.out.println("Interest for the "+principal+" over "+years+" years= "+interest);
	}
}

class SBI extends Bank
{
	 @Override
	double rateOfInterest()
	{
		return 6.8;
	}
}
class HDFC extends Bank
{
	@Override
	double rateOfInterest()
	{
		return 7.0;
	}
}

class ICICI extends Bank
{
	@Override
	double rateOfInterest()
	{
		return 6.7;
	}
}

public class BankingInterestCalculation {
   public static void main(String args[])
   {
	  double principal = 100000.0;
	  int years = 5;
	  
	  SBI sbi = new SBI();
	  HDFC hdfc = new HDFC();
	  ICICI icici = new ICICI();
	  
	  System.out.println("Bank : SBI");
	  System.out.println("Rate of the Interest : "+sbi.rateOfInterest()+" %.");
	  sbi.calculateInterest(principal, years);
	  System.out.println();
	  
	  System.out.println("Bank : HDFC");
	  System.out.println("Rate of the Interest : "+hdfc.rateOfInterest()+" %.");
	  hdfc.calculateInterest(principal, years);
	  System.out.println();
	  
	  System.out.println("Bank : ICICI");
	  System.out.println("Rate of the Interest : "+icici.rateOfInterest()+" %.");
	  icici.calculateInterest(principal, years);
   }
}
