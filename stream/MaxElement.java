package com.kodewala.practice.api.stream;

import java.util.Arrays;
import java.util.List;

public class MaxElement {
	public static void main(String args[])
	{
	  List<Integer> list = Arrays.asList(5,2,9,7,22,7,30,24,56,5);
	  int ans = list.stream().max((a,b)->a-b).get();
	  System.out.print("Maximum element : "+ans);
	}
}
