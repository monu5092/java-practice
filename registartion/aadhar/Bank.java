package com.kodewala.registartion.aadhar;

public class Bank implements IAadhar
{
	
	@Override
	public void changeMobileNumber()
    {
   	 System.out.print("give new Mobile number");
    }

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.print("Register Through bank");
	}

	@Override
	public void suspend() {
		// TODO Auto-generated method stub
		System.out.print("Suspend Through Bank");
	}

}
