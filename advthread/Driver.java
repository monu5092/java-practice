package com.kodewala.advthread;

class Task 
{
	public synchronized void printOdd()
	{
		for(int i=1;i<15;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd Number is : "+i+" "+Thread.currentThread().getName());
			}
		}
	}
	public synchronized void printEven()
	{
		for(int i=1;i<15;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number : "+i+" "+Thread.currentThread().getName());
			}
		}
	}
}

class EvenThread extends Thread
{    
	Task task;
	
	public EvenThread(Task _task)
	{
		super();
		this.task = _task;
	}
	
	public void run()
	{
	   task.printEven();	
	}
}


class OddThread extends Thread
{
	Task task;
	public  OddThread(Task _task)
	{
	    super();
		this.task = _task;
	}
	public void run()
	{
		task.printOdd();  // calling 
	}
}


public class Driver {
    public static void main(String args[])
    {
//    	Task task = new Task();
//    	EvenThread evenThread = new EvenThread(task);
//    	evenThread.start();
//    	
//    	OddThread oddThread = new OddThread(task);
//    	oddThread.start();
    	
    	Task task1 = new Task();
    	Task task2 = new Task();
    	
    	EvenThread evenThread = new EvenThread(task1);
    	evenThread.start();
    	
    	OddThread oddThread = new OddThread(task2);
    	oddThread.start();
    	
    	
    	
    }
}
