package com.kodewala.string;

import java.util.Scanner;

public class CharCount {
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Give input as a sentence String");
    	String input = sc.nextLine();
    	
    	String str[] = input.split(" ");
    	
        int count = 0;
    	
    	for(int i=0;i<str.length;i++) {
    		count += str[i].length();
    	}
    	System.out.print(count);
    }
}
