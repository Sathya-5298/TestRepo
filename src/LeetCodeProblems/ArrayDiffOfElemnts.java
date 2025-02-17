package LeetCodeProblems;

public class ArrayDiffOfElemnts 
{
	public static void main(String[] args) 
	{
		int [] arr = {5,2,9,8,6,11};
		int diff = 0;
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i + 1] - arr[i] > diff)
			{
				diff = arr[i + 1] - arr[i];
			}
		}
		System.out.println(diff);
	}
}
