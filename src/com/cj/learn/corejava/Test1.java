package com.cj.learn.corejava;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Num1 -");
		int num1 = scn.nextInt();
		System.out.println("Enter Num2 -");
		int num2 = scn.nextInt();
		System.out.println("Enter Num3 -");
		int num3 = scn.nextInt();
		
		
		if (num1 > num2 && num1 > num3 )
		{
			System.out.println("Num1 is greater");
		}
		else if (num2 > num1 && num2 > num3 )
		{
			System.out.println("Num2 is greater");
		}
		else if (num3 > num2 && num3 > num1 )
		{
			System.out.println("Num3 is greater");
		}
		else
		{
			System.out.println("All are equal");
		}
		
		scn.close();
	}
}
