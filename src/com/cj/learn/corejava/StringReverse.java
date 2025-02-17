package com.cj.learn.corejava;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) 
	{
		
		System.out.println(reverseString("qwerty"));
		
		System.out.println("Enter a string");
		Scanner scn = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		sb.append(scn.next());
		System.out.println(sb.reverse());
		scn.close();
		
	}
	
	public static String reverseString(String value)
	{
		String temp = "";
		
		for (int i = 0; i <= value.length() - 1; i++)
		{
			temp = value.charAt(i) + temp;
		}
		return temp;
	}
}
