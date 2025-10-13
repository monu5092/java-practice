package com.kodewala.thread;


class PrintEvenAndOdd extends Thread{
	
	@Override
	public void run() {
		printOdd();
		printEven();
	}
	private void printOdd()
	{
		for(int i=0;i<10;i++)
		{
			if(i%2!=0) {
				System.out.println("Odd : "+i+" Thread name: "+Thread.currentThread().getName());
			}
		}
	}
	private void printEven() {
		for(int i=0;i<10;i++) {
			if(i%2==0)
			{
				System.out.println("Even : "+i+" Thread name: "+Thread.currentThread().getName());
			}
		}
	}
}
public class Driver {
   public static void main(String args[])
   {
	   PrintEvenAndOdd t1 = new PrintEvenAndOdd();
	  // t1.start();
	   
	   t1.run();
	   
	   PrintEvenAndOdd t2 = new  PrintEvenAndOdd();
	   t2.start();
   }
}
