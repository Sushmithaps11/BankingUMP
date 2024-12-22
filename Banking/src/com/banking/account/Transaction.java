package com.banking.account;

public class Transaction 
{
public void deposit (double amt , Account a1)
{
	if(amt >=0)
	{
		double b1 = a1.getBal() + amt;
		a1.setBal(b1);
	}
	else
	{
		System.out.println("Invalid Amt");
	}
}
public void withdraw(double amt , Account a1)
{
	if(amt <= a1.getBal() && amt >=0)
	{
		double b1 = a1.getBal() - amt;
		a1.setBal(b1);
 	}
	else
	{
		System.out.println("Insufficient Bal");
	}
}
public void checkbal(Account a1)
{
	System.out.println("Current Bal of :" + a1.getName() + " Is Rs :" + a1.getBal());
}
}
