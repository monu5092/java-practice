package com.kodewwala.serilization;

import java.io.Serializable;

public class Person implements Serializable
{
   public String personFirstName;
   public String personLastName;
   
   public Person(String _personFirstName,String _personLastName)
   {
	   this.personFirstName = _personFirstName;
	   this.personLastName = _personLastName;
   }
}
