package com.cj.learn.corejava;

public class SumOfOddIndexes {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,5,9,8,7,6};
		int n = arr.length;
		int oddSum = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(i % 2 != 0)
			{
				oddSum+= arr[i];
			}
		}
		System.out.println("Sum of Odd Indexes are " + oddSum);
	}
}
