package com.cj.learn.corejava;

public class CountDigitOccurance {

	public static void main(String[] args) 
	{
		int digit1, digit2;
		
		
		for ( int i = 10; i < 100; i++)
		{
			digit1 = i % 10;
			digit2 = i / 10;
			
			if (i == (digit1 + digit2) + (digit1 * digit2) )
			{
				System.out.println(i + " is a Spl number");
			}
			else
			{
				System.out.println(i + " is not a Spl number");
			}
		}
	}
}
