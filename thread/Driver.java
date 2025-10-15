package com.kodewala.reentrantsynchronized.thread;

import java.util.concurrent.locks.ReentrantLock;

class AccountMgmt
{
	ReentrantLock reentrantlock = new ReentrantLock();
	public void addPayee()
	{
		reentrantlock.lock();
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		reentrantlock.unlock();   // if ReentrantLock is not unlock then only one thread is running is called deadLock 
	}
}

class MyThread extends Thread
{
	AccountMgmt accountMgmt;
	public void run()
	{
		accountMgmt.addPayee();
	}
	public MyThread(AccountMgmt accountMgmt)
	{
		this.accountMgmt = accountMgmt;
	}
}

public class Driver {
   public static void main(String args[])
   {
	   AccountMgmt task = new AccountMgmt();
	   MyThread t1 = new MyThread(task);
	   MyThread t2 = new MyThread(task);
	   MyThread t3 = new MyThread(task);
	   t1.start();
	   t2.start();
	   t3.start();
   }
}
