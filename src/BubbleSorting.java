
public class BubbleSorting {

	public static void main(String[] args) 
	{
		int [] a = {5,2,9,8,1,4,7};

		int temp = 0;

		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length-1; j++ )
			{
				if (a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for (int j : a) 
		{
			System.out.println(j);
		}
	}

}
