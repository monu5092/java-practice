package com.kodewala.thread;

class MyFirstThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("My First thread is running "+Thread.currentThread().getName());
	}
}

class MySecondThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("I am inside run 2nd Thread...."+Thread.currentThread().getName());
	}
}

public class HelloWorld {
    public static void main(String args[])
    {
    	String currentThreadname = Thread.currentThread().getName();
    	System.out.println(currentThreadname);
    	
    	System.out.println("HelloWorld.main() : START");
    	
    	for(int i=0;i<5;i++) 
    	{
    		System.out.println("HelloWorld.main()....in loop");
    	}
    	
    	MyFirstThread t1 = new MyFirstThread();
    	t1.start();
    	
    	MySecondThread t2 = new MySecondThread();
    	t2.start();
    	
    }
}
