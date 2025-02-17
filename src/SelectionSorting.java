
public class SelectionSorting {

	public static void main(String[] args) 
	{
		int[] a = {9,2,3,7,5,8,1};
		
		int b;
		int temp = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			b = i;
			
			for(int j = i+1; j < a.length; j++ )
			{
				if(a[i] > a[j])
				{
					b = j;
				}
			}
			temp = a[i];
			a[i] = a[b];
			a[b] = temp;
			System.out.println(a[i]);
		}

	}

}
