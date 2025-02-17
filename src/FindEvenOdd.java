
public class FindEvenOdd 
{
	public static void main (String [] args)
	{
		int n = 17;

		for(int i = 0; i < n; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println(i + " is a even");
			}
			else
			{
				System.out.println(i + " is a odd");
			}
		}
	}

}
