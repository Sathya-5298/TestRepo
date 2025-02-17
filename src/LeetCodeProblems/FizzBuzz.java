package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz 
{
	public static void main(String[] args) 
	{
		System.out.println(fuzzBuzz(1));
		System.out.println(fuzzBuzz(3));
		System.out.println(fuzzBuzz(15));
	}
	
	public static List<String> fuzzBuzz(int n)
	{
		List<String> result = new ArrayList<String>();
		
		for(int i = 0; i  < n; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
			{
				result.add("FuzzBuzz");
			}
			else if(i % 3 == 0)
			{
				result.add("Fuzz");
			}
			else if(i % 5 == 0)
			{
				result.add("Buzz");
			}
			else
			{
				result.add(i + "");
			}
		}
		return result;
	}
}
