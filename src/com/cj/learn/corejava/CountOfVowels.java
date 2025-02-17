package com.cj.learn.corejava;

public class CountOfVowels {

	public static void main(String[] args) 
	{
		String s = "This is a vowel sentance";
		int vowels = 0;
		int consonants = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
				s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
	}

}
