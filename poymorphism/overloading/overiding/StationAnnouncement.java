package com.kodewla.poymorphism.overloading.overiding;

class Announcement
{
	void Anouncement(String generalAnouncement)
	{
		System.out.println("Its general announcemnt : "+generalAnouncement);
	}
	
	void Anouncement(int trainNumber,String platform )
	{
		System.out.println("Train Announcement: Train number " + trainNumber + " is arriving on platform "+platform);
    }
	
	void Anouncement(int trainNumber,String location,int min)
	{
		System.out.println("Train Delayed Announcement: Train Number "+trainNumber+" is delayed by "+min+" min from the "+location+".");
	}		
}

public class StationAnnouncement {
  public static void main(String args[])
  {
	  Announcement a1 = new Announcement();
	  a1.Anouncement("Welcome to the SMVT railway station.");
	  a1.Anouncement(2052,"2");
	  a1.Anouncement(2034,"Delhi",30);
  }
}
