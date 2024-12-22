package com.banking.service;
import com.banking.account.Account;
import com.banking.account.Transaction;

public class Gpay implements BankUser 
{

	@Override
	public void transaction(double amt, Transaction t1, int choice, Account a1) 
	{
		if(choice == 1)
		{
			send(amt,t1,a1);
			t1.checkbal(a1);
		}
		else if(choice == 2)
		{
			recieve(amt,t1,a1);
			t1.checkbal(a1);
		}
		else
		{
			System.out.println("Invalid Option");
		}
		
	}
	public void send(double amt , Transaction t1 , Account a1)
	{
		t1.withdraw(amt, a1);
	}
	public void recieve(double amt , Transaction t1 , Account a1)
	{
		t1.deposit(amt, a1);
	}

}
