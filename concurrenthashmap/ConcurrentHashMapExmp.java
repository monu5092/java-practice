package com.kodewala.concurrenthashmap;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExmp 
{
  public static void main(String args[])
  {
	  ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
	  
	  map.put(1,"Monu");
	  map.put(2,"Ankush");
	  map.put(3,"rahul");
	  
	  for (Integer key : map.keySet()) {
          System.out.println(key + " => " + map.get(key));

          
          map.put(4, "Patro");
      }
         
	  System.out.println("Final Map: " + map);
  }
}
