package com.kodewala.registartion.aadhar;

public interface IAadhar 
{
	void register();
    void suspend();
    
    public default void changeAddress()
    {
    	approve();
   	 System.out.print("Give new Address: ");
    }
    
    public default void changeMobileNumber()
    {
    	approve();
   	 System.out.print("give new Mobile number");
    }
    
    private static void approve() 
    {
    	
    }
    
}
