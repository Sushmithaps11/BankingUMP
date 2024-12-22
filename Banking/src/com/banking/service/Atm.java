package com.banking.service;
import com.banking.account.Account;
import com.banking.account.Transaction;

public class Atm implements BankUser
{

	@Override
	public void transaction(double amt, Transaction t1, int choice, Account a1)
	{
		if(choice == 1)
		{
			t1.deposit(amt, a1);
			t1.checkbal(a1);
		}
		else if(choice == 2)
		{
			t1.withdraw(amt, a1);
			t1.checkbal(a1);
		}
		else
		{
			System.out.println("Invalid Option");
		}
		
	}
	
}




