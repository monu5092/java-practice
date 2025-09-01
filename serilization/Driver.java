package com.kodewwala.serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver 
{
  public static void main(String args[]) throws IOException, ClassNotFoundException
  {
	  Person p1 = new Person("Monu","Kumar");
	  
	  // Serialization (Convert object into byteStream)
	  FileOutputStream fOut = new FileOutputStream("Perso.ser");
	  ObjectOutputStream oOut = new ObjectOutputStream(fOut);
	  
	  //DeSeriallization (Convert object into byteStream)
	  oOut.writeObject(p1);
	  
  }
}
