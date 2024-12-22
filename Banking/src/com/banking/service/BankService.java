package com.banking.service;

public class BankService 
{
	BankUser b1;
	public BankUser login (int pin)
	{
		if(pin == 1111)
		{
			b1 = new Atm();
			System.out.println("Welcome To ATM");
			return b1;
		}

		else if(pin == 2222)
		{
			b1 = new PhonePay();
			System.out.println("Welcome To PhonePay");
			return b1;
		}

		else if(pin == 3333)
		{
			b1 = new Gpay();
			System.out.println("Welcome To GPay");
			return b1;
		}
		else
		{
			System.out.println("Invalid Pin");
			return b1;
		}

	}


}
