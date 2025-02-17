package com.cj.learn.corejava;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		
		String s1 = "Core Java";
		String s2 = "Java";
		
		System.out.println(s1.endsWith(s2));
		
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scn.next();
		String output = "";
		
		for(int i = 0; i <= input.length() - 1; i++)
		{
			output = input.charAt(i) + output;
		}
		System.out.println(output);
		if(input.equals(output))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		scn.close();
	}
}
