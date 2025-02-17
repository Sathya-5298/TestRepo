import java.util.Scanner;

public class InputsFromKeyboard {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Value");
		
		int n = scn.nextInt();
		String s = scn.next();
		
		System.out.println(n);
		System.out.println(s);
		
		scn.close();
	}
}
