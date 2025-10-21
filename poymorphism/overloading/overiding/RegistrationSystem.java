package com.kodewla.poymorphism.overloading.overiding;

class Registration
{
	void doRegistration(String aadhar)
	{
		System.out.println("Register Yourself using Adahar : "+aadhar);
	}
	
	void doRegistration(String aadhar,String id)
	{
		System.out.println("Register Yourself using id and Aadhar : "+ id +" "+ aadhar);
	}
	void doRegistration(String mobileNumber, int otp)
	{
		System.out.println("Register Yourself using mobile and otp : " +mobileNumber+" "+otp);
	}
	void doRegistration(String mobileNumber,int otp,String aadhar)
	{
		System.out.println("Registration yourself "+mobileNumber+" "+otp+" "+ aadhar);
	}
}

public class RegistrationSystem {
   public static void main(String args[])
   {
	   Registration r1 = new Registration();
	   r1.doRegistration("7195");
	   r1.doRegistration("7195","Ece12");
	   r1.doRegistration("7061173053",2345);
	   r1.doRegistration("7061173053",235,"7195");
   }
}
