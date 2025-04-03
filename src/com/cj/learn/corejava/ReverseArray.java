package com.cj.learn.corejava;

public class ReverseArray {

	public static void main(String[] args) 
	{
		 int[][] arr = {{12,98,99},{10,20},{25,52,2,5}};
		 
		 for(int[] n : arr)
		 {
			 for(int m : n)
			 {
				 System.out.println(m);
			 }
			 System.out.println("=========");
		 }
		 
		
		String[] str = {"Ind", "Aus", "Eng", "PAK"};
		
		int j = str.length - 1;
		String temp = "";
		
		for(int i = 0; i <= (str.length - 1)/2; i++)
		{
			temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			j--;
		}
	
		
		for(String n : str)
		{
			System.out.println(n);
		}
	}
}
