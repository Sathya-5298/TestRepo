
public class FindMaxMinArray {

	public static void main(String[] args) 
	{
		int [] arr = {5,2,9,8,1,3,4};
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length;i++)
		{
			if (arr[i]<min)
			{
				min = arr[i];
			}
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Maximum: " + max);
		System.out.println("Minimun: " + min);
	}
}
