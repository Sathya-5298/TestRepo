
public class ArraysDemo {

	public static void main(String[] args) 
	{
		int[] arr1 = new int[4];
		
		arr1[0] = 5;
		arr1[1] = 2;
		arr1[2] = 9;
		arr1[3] = 8;
		
		int[] arr2 = {5,2,1,9,9,8,};
		
		System.out.println(arr1[0]);
		System.out.println(arr2[1]);
		
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name = {"Hello","Selenium","COreJava","Webdriver"};
		
		for(String names:name)
		{
			System.out.println(names);
		}
	}
}
