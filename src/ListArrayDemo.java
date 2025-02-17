import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayDemo 
{

	public static void main(String[] args) 
	{
		ArrayList <String> al = new ArrayList <String>();

		al.add("Selenium");
		al.add("Java");
		al.add("Webdriver");
		al.add("Automation");

		System.out.println(al.get(2));
		
		for(String i:al)
		{
			System.out.println(i);
			System.out.println(al.contains("Java"));
		}
		
		String[] name = {"Hello","Selenium","CoreJava","Webdriver"};
		
		List<String> arrayToList = Arrays.asList(name);
		System.out.println(arrayToList.contains("CoreJav"));
	}
}
