package com.kodewala.exception.thro.thros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources 
{
  public static void main(String args[])
  {
	  
  }
  
  public void readFiles()
  {
	  try(BufferedReader br = new BufferedReader(new FileReader(""));) 
	  {
		 String line = br.readLine();
		 System.out.println("reading file");
	  }
	  catch(IOException e)
	  {
		  e.printStackTrace();
	  }
  }
}
