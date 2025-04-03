package com.cj.learn.corejava;

public class UpperCaseToLowerCaseAndViceVersa 
{
	public static void main(String[] args) 
	{
		 String input = "AppLE and BaNaNa aRe FrUits";
	     StringBuilder toggledString = new StringBuilder();

	     for (char c : input.toCharArray()) 
	     {
	         if (Character.isUpperCase(c)) 
	         {
	             toggledString.append(Character.toLowerCase(c));
	         } 
	         else if (Character.isLowerCase(c)) 
	         {
	             toggledString.append(Character.toUpperCase(c));
	         } 
	         else 
	         {
	             toggledString.append(c);
	         }
	     }
	     System.out.println("Toggled String: " + toggledString);
	}

}
