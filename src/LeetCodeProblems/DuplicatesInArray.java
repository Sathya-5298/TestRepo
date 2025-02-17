package LeetCodeProblems;

public class DuplicatesInArray 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,7,8,2,1,8,9};
		
		int n = a.length;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
	}
}
