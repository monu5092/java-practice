package com.kodewala.String.Buffer;

import java.util.Scanner;

public class OrderStatus {
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter your username: ");
    	String userName = sc.nextLine();
    	
    	String placedDate = "10/8/2025";
    	
    	StringBuilder sb = new StringBuilder("Dear ");
    	 
    	sb.append(userName+" your Order has been Placed on "+placedDate+".");
    	
    	System.out.print(sb);
    	
    }
}
