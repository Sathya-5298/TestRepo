package com.cj.learn.corejava;

public class BankAccount 
{
	private String accountName;
	private long accountNumber ;
	private double accountBalance;
	
	public BankAccount(String accountName, long accountNumber, double accountBalance)
	{
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public void depositAmount(double amount)
	{
		if (amount > 0)
		{
			accountBalance = accountBalance  + amount;
			System.out.println("Deposit Successful " + amount);
		}
		else
		{
			System.out.println("Deposite is not possible");
		}
	}
	
	public void WithdrawlAmount(double amount)
	{
		if (amount > 0)
		{
			accountBalance = accountBalance  - amount;
			System.out.println("Withdrawl Successful " + amount);
		}
		else
		{
			System.out.println("Withdrawl is not possible");
		}
	}
	
	public void dipslayCurrentBalance()
	{
		System.out.println("Current Balance for : " + accountNumber + " " + accountName + " " + accountBalance);
	}
}
