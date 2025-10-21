package com.kodewala.practice.apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumber {
	public static void main(String args[])
	{
	   List<Integer> list = Arrays.asList(2,3,4,5,6,7);
	   
	   List<Integer> ans = list.stream().map(n->n*n).collect(Collectors.toList());
	   System.out.print(ans);
	}
}
