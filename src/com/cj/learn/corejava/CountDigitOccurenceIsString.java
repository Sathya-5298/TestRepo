package com.cj.learn.corejava;

import java.util.HashMap;
import java.util.Map;

public class CountDigitOccurenceIsString 
{
	public static void main(String[] args) 
	{
		String s = "This is a vowel sentance";
		
		int totalCount = s.length();
		
		int totalCOuntAfterRemoval = s.replace("i","").length();
		
		int charOccuranceCount = totalCount - totalCOuntAfterRemoval;
		
		System.out.println("Occrance of i: " + charOccuranceCount);
		
		getCharOccurancesCount(s);
	}
	
	public static void getCharOccurancesCount(String str)
	{
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		str = str.replace(" ", "");
		
		char[] strArray = str.toCharArray();
		
		for(char c : strArray)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c) + 1);
			}
			else
			{
				charMap.put(c, 1);
			}
		}
		System.out.println(str + ":" +charMap);
	}
}
