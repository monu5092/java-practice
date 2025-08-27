package com.kodewala.interfacdefalut;

public class RuralBank implements IBanking
{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void settle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cnacelCheque() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doRTGSPayment(boolean flag) {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public default void applyKcc()  
//	{
//		(Error because In interface all methods are public)
//	}
	
	@Override
	public  void applyKcc()
	{
		
	}
	
	public void printPassbook()
	{
		IBanking.printPassbook();
	}

}
