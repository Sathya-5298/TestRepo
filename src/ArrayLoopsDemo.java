public class ArrayLoopsDemo 
{
	public static void main(String[] args) 
	{
		int [] n = {2,3,4,5,6,7,8,9};
		
		for(int i = 0; i < n.length; i++)
		{
			if (n[i] % 2 == 0)
			{
				System.out.println(n[i] + " is a even");
			}
			else
			{
				System.out.println(n[i] + " is a odd");
			}
		}
	}
}
