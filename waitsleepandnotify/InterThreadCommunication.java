package com.koodewala.thread.waitsleepandnotify;

class WriteAndRead
{
	private String message;
	
	public synchronized void writeMessage(String _message)
	{
		System.out.println("Writing the message..."+Thread.currentThread().getName());
		this.message = _message;
		System.out.println("Message written....."+Thread.currentThread().getName());
		this.notify();
		//this.notifyAll();
	}
	
	public synchronized void readMessage() throws InterruptedException
	{
		System.out.println("Waiting to read the message"+Thread.currentThread().getName());
	     this.wait();
	     System.out.println("Message read : "+message+" "+Thread.currentThread().getName());
	}
}

class ReadThread extends Thread
{
	WriteAndRead writeandread = new WriteAndRead();
	
	public ReadThread(WriteAndRead _writeandread)
	{
		this.writeandread = _writeandread;
	}
	public void run()
	{
		try {
			writeandread.readMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class WriteThread extends Thread
{
	WriteAndRead writeandread = new WriteAndRead();
	
	public WriteThread(WriteAndRead _writeandread) {
		this.writeandread = _writeandread;
	}
	
	public void run()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writeandread.writeMessage("This is test Message......");
	}
}

public class InterThreadCommunication {
    public static void main(String args[])
    {
    	WriteAndRead obj1 = new WriteAndRead();
    	ReadThread readThread = new ReadThread(obj1);
    	WriteThread writeThread = new WriteThread(obj1);
    	
    	readThread.setName(" : [Reader Thread]");
    	writeThread.setName(" : [Writer Thread]");
    	
    	readThread.start();
    	writeThread.start();
    }
}
