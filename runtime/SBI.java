package com.kodewala.runtime;

public class SBI extends BankingSystem {

	
	 public void printPassbook()
	   {
		   System.out.println("BnkingSystem.printPassBook() - with SBI logo");
	   }
	
	public static void main(String args[])
	{
	   BankingSystem sbiBank = new SBI(); 
	   // compile time ----> printPassbook() method should be there in SBI(ref)
	   // at runtine ---> printPassbook() method should be there in SBI(actual object created)
	   
	   BankingSystem bankingSystem = new SBI();
	   
	   bankingSystem.printPassbook();
	   // printPassbook() method should be there in BankingSystem(ref)
	   // at runtime --> printPassbook() method should be there in SBI(actual ObjectCreated)
	   
	   sbiBank.printPassbook();
	   // sbiBank.pay();
	   
	   // Parent p = new Child();
	}
}
