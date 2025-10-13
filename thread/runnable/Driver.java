package com.kodewala.thread.runnable;

class Bank implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is Banking Process"+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		 System.out.println(Thread.currentThread().getState());
		
		printPassbook();
	}
	
	public void printPassbook()
	{
		System.out.println("Print the passbok: "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		 System.out.println(Thread.currentThread().getState());
		
	}
	
}

public class Driver {
   public static void main(String args[])
   {
	   Bank bank = new Bank();
	   Thread t1 = new Thread(bank);
	   Thread t2 = new Thread(bank);
	   Thread t3 = new Thread(bank);
	   
	  
	   t1.start();
	   t2.start();
	   t3.start();
	 
	  
   }
}
