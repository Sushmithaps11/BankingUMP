package com.banking.service;

import com.banking.account.Account;
import com.banking.account.Transaction;

public interface BankUser 
{
	public void transaction(double amt , Transaction t1 , int choice , Account a1);

}
