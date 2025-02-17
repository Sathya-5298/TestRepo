package com.cj.learn.corejava;

public class BankMain 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 10;
		int res = a & b;
		
		System.out.println(res);
		
		
		BankAccount ba = new BankAccount("Sample", 1234567890, 5000);
		
		ba.depositAmount(6298);
		ba.dipslayCurrentBalance();
		ba.WithdrawlAmount(5298);
		ba.dipslayCurrentBalance();
	}
}
