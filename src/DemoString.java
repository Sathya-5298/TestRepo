
public class DemoString 
{
	public static void main(String[] args) 
	{
		String s = "Selenium Webdriver Java";

		String[] splitDemo = s.split("Java");

		for(String sld : splitDemo)
		{
			System.out.println(sld);
			System.out.println(sld.trim());
		}


		for (int i = 0; i < s.length(); i++) 
		{ 
			System.out.println(s.charAt(i)); 
		}
		
		System.out.println("-------------------------");
		
		for (int i = s.length() - 1; i >= 0; i--)
		{
			System.out.println(s.charAt(i));
		}
	}
}
