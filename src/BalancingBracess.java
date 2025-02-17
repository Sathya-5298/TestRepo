
public class BalancingBracess {

	public static void main(String[] args) 
	{
		String braces = "{}{}}{{{}}}}{}{}{";
		int openBrace = 0;
		int closeBrace = 0;
		
		for(int i = 0; i < braces.length(); i++)
		{
			if (openBrace >= closeBrace)
			{
				if (braces.charAt(i) == '{')
				{
					openBrace++;
				}
				else if (braces.charAt(i) == '}')
				{
					closeBrace++;
				}
			}
			else
			{
				System.out.println("Bracess Unbalanced");
				return;
			}
		}
		if (openBrace == closeBrace)
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Unbalanced");
		}
	}
}
