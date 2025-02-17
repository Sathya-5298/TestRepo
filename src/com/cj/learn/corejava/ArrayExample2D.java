package com.cj.learn.corejava;

public class ArrayExample2D {

	public static void main(String[] args) 
	{
		
		Object[][] arr2D = 
			{
					{1,2,3},
					{"A","s","D","F"},
					{"ASDF","POIU"}
			};
		
		for(Object[] x : arr2D)
		{
			for(Object y: x)
			{
				System.out.println(y);
			}
		}
		
		Object[] objarr = {1,12.98,"IND","AUS","S"};
		
		for(Object x : objarr)
		{
			System.out.println(x);
		}
		
		int [] [] arr = new int [5][10];
		
		for(int i = 2; i <= 6; i++)
		{
			for(int j = 1; j <= 10; j++)
			{
				arr[i-2][j-1] = i * j;
			}
		}
		
		for(int[] n : arr)
		{
			for(int m: n )
			{
				System.out.print(m + " ");
			}
			System.out.println();
		}	
	}
}
