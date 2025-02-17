
public class FindPrime 
{
	public static void main (String [] args)
	{
		int[] num = {5,2,9,8,11,17,26,10,15,100};
		
		for(int prime:num)
		{
			boolean isPrime = true;
			
			for (int i=2; i<= prime/2; i++)
			{
				if (prime % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(prime + " is a prime ");
			}
			else
			{
				System.out.println(prime + " is not a prime ");
			}
		}
	}
}
