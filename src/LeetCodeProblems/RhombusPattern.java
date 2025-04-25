package LeetCodeProblems;

public class RhombusPattern 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int space = n / 2;
		int star = 1;
		
		for(int i = 0; i < n; i++)
		{
			for(int  j = 0; j < space; j++)
			{
				System.out.print(" " + " ");
			}
			
			for(int k = 0; k < star; k++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
			
			if(i < n / 2)
			{
				space--;
				star = star + 2;
			}
			else
			{
				space++;
				star = star - 2;
			}
		}
	}
}
