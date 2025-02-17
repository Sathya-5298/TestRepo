package LeetCodeProblems;

import java.util.ArrayList;


public class CompareArray 
{
	public static void main(String[] args) {
		

	int[] arr1 = {1,5,2,9,8,7};
	int[] arr2 = {1,9,9,8,5,2};
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	for(int i = 0; i < arr1.length; i++)
	{
		if(arr1[i] == arr2[i])
		{
			al.add(arr1[i]);
		}
	}
	
	Object[] y = al.toArray();
	
	for(Object x : y)
	{
		System.out.println(x);
	}
}
}
