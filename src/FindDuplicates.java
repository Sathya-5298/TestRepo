import java.util.HashSet;

public class FindDuplicates 
{
	public static void main (String [] args)
	{
		int [] arr = {5,2,9,8,1,3,5,2};
		
		HashSet<Integer> unique = new HashSet<Integer>();
		
		HashSet<Integer> duplicate = new HashSet<Integer>();
		
		for(int numbers : arr)
		{
			if(!unique.add(numbers))
			{
				duplicate.add(numbers);
			}
		}
		System.out.println("Duplicates are: " + duplicate);
	}

}
