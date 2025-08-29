package com.kodewala.intefac9java;

public interface IBanking 
{
	public static final int MAX = 100;
	int MIN = 20;
	
	abstract void pay();
	
	public abstract void settle();
	
	void cnacelCheque();
	void stopPayment();
	void doRTGSPayment(boolean flag);
	
	// default method in java interface come at java 8
	public default void applyKcc()
	{
		
	}
	
	public static void printPassbook()
	{
		
		findPrinter();
		connectPrinter();
		// some business logic(Specific for passbook);
		doPrint();
	}
	public static void printReceipt()
	{
		findPrinter();
		connectPrinter();
		// printReceipt logic
		doPrint();
	}
	
	private static void findPrinter()
	{
		// method are private in interface given by java 9
	}
	private static void connectPrinter()
	{
		
	}
	private static void doPrint()
	{
		
	}
}
