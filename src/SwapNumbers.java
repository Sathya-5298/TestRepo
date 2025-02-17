
public class SwapNumbers 
{
	public static void main (String [] args)
	{
		int a = 52;
		int b = 98;
		
		System.out.println("Bfore Swapping: " + a);
		System.out.println("Bfore Swapping: " + b);
		/*
		int c = a;
		a = b;
		b = c;
		
		System.out.println("After Swapping: " + a);
		System.out.println("After Swapping: " + b);
		*/
		
		// without using third variable
		
		a = a - b;
		b = a + b;
		a = b - a;
		
		System.out.println("After Swapping: " + a);
		System.out.println("After Swapping: " + b);
	}

}
