package com.kodewala.thread;

class OddNumber extends Thread
{
	@Override
	public void run()
	{
		int n = 19;
		if(n%2!=0) {
			System.out.println("Number is "+ n +" Odd."+Thread.currentThread().getName());
		}
	}
}
class EvenNumber extends Thread{
	@Override
	public void run()
	{
		int m = 12;
		if(m%2==0) {
			System.out.println("Number is "+ m +" Even."+Thread.currentThread().getName());
		}
	}
}

public class Driver{
   public static void main(String args[])
   {
	   System.out.println("Start:");
	   OddNumber odd = new OddNumber();
	   odd.start();
	   
	   EvenNumber even = new EvenNumber();
	   even.start();
	   
	   System.out.println("End:");
   }
}
