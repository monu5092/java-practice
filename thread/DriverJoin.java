package com.kodewala.thread;


class Cooking extends Thread
{
	public void run()
	{
		System.out.println("Done with cooking....");
	}
}
class Serving extends Thread
{
	public void run()
	{
		System.out.println("Food Serving started.....");
	}
}
public class DriverJoin {
     public static void main(String args[]) throws InterruptedException
     {
    	 Cooking t1 = new Cooking();
    	 t1.start();
    	 
    	 //t1.start();   thread terminated and try to restart it will give IllegalThreadStateException
    	 
    	 t1.join();  //main thread will join t1.
    	 
    	 Serving t2 = new Serving();
    	 t2.start();
    	 
    	 //thread terminated and try to restart it will give IllegalThreadStateException 
     }
}
