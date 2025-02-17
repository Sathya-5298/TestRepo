
public class Palindrome {
	
	void palindrome(int num)
	{
		int n = num;
		int rev = 0;
		
		while(num > 0)
		{
			int a = num % 10;
			rev = (rev * 10) + a;
			num = num/10;
		}
		if (rev == n)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
	
	void reverseNum(int num)
	{
		int rev = 0;
		
		while (num > 0)
		{
			int b = num % 10;
			rev = (rev * 10) + b;
			num = num/10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) 
	{
		Palindrome pd = new Palindrome();
		
		pd.palindrome(5298);
		pd.reverseNum(5298);

	}

}
