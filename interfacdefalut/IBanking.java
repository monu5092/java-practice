package com.kodewala.interfacdefalut;

public interface IBanking {
  
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
		System.out.println("Print the PassBook and make account update");
	}
}
