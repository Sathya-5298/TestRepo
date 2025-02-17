package com.cj.learn.corejava;

public class ArrayEx 
{
	public static void main(String[] args) 
	{
		int n = 3;
		int cube = 0;
		
		for (int i = 0; i <= n; i++)
		{
			cube = i*i*i;
		}
		System.out.println(cube);
		
		
		int[] arr = {1, 2, 3, 4, 5};
		for (int i = 0; i < arr.length / 2; i++) 
		{
		    int temp = arr[i];
		    arr[i] = arr[arr.length - i - 1];
		    arr[arr.length - i - 1] = temp;
		}
		for (int num : arr) {
		    System.out.print(num + " ");
		}
	}
}
