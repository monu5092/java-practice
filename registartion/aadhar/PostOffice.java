package com.kodewala.registartion.aadhar;

public class PostOffice implements IAadhar 
{

	
	
	@Override
	public void changeAddress()
    {
   	 System.out.print("Give new Address: ");
    }

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.print("Register Through PostOffice");
	}

	@Override
	public void suspend() {
		// TODO Auto-generated method stub
		System.out.print("Suspend Through PostOffice");
	}

}
