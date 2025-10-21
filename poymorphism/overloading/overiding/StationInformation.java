package com.kodewla.poymorphism.overloading.overiding;


class Station
{
	void displayInfo()
	{
		System.out.println("This is general station");
	}
}

class BusStation extends Station
{
	void displayInfo()
	{
		System.out.println("This is BusStation Buses and arrive and depart from here.");
	}
}

class RailwayStation extends Station
{
	void displayInfo()
	{
		System.out.println("This is Railway station Train are arrive and depart from here.");
	}
}
public class StationInformation {
   public static void main(String args[])
   {   
	   Station s1 = new Station();
	   s1.displayInfo();
	   
	   BusStation b1 = new BusStation();
	   b1.displayInfo();
	   
	   RailwayStation r1 = new RailwayStation();
	   r1.displayInfo();
   }
}
