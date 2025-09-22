package com.kodewala.failfastfailsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafe 
{
	public static void main(String[] args)
    {
	List<String> arraList = new ArrayList<String>();
	arraList.add("Apple");
	arraList.add("Samsung");
	arraList.add("LG");
	arraList.add("TCL");

	Iterator<String> itr = arraList.iterator();
	while (itr.hasNext())
	{
	    String brand = itr.next();
	  //  arraList.remove(2);
	    System.out.println(brand);
	}

	List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
	copyOnWriteArrayList.add("Apple");
	copyOnWriteArrayList.add("Samsung");
	copyOnWriteArrayList.add("LG");
	copyOnWriteArrayList.add("TCL");

	Iterator<String> itr1 = copyOnWriteArrayList.iterator();
	while (itr1.hasNext())
	{
	    String brand = itr1.next();
	    copyOnWriteArrayList.remove(1);
	   
	}
    }
}
