package LeetCodeProblems;

public class SumOfArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		
		System.out.println(arraySum(arr));
	}
	public static int arraySum(int[] a)
	{
		int sum = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			sum += a[i];
		}
		return sum;
	}
}
