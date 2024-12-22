package com.banking.utlilization;

import java.util.Scanner;

import com.banking.account.Account;
import com.banking.account.Transaction;
import com.banking.service.BankService;
import com.banking.service.BankUser;

public class MainUser 
{
  public static void menu()
  {
	  System.out.println("Enter Pin \n1111 for Atm \n2222 for PhonePay \n3333 for Gpay");
  }
  public static void main(String[] args) 
  {
	menu();
	Transaction t1 = new Transaction();
	Account a1 = new Account();
	BankService b1 = new BankService();
	Scanner sc = new Scanner(System.in);
			System.out.println("Enter PIN");
			int pin = sc.nextInt();
			
			switch(pin)
			{
			case 1111 : BankUser buser1 = b1.login(pin);
			System.out.println("Enter Amount");
			double amt = sc.nextDouble();
			System.out.println("1.Send 2. Recieve");
			System.out.println("Enter Choice");
			int choice = sc.nextInt();
			buser1.transaction(amt, t1, choice, a1);
			break;
			
			case 2222 : BankUser buser2 = b1.login(pin);
			System.out.println("Enter Amount");
			double amt1 = sc.nextDouble();
			System.out.println("1. Send 2. Recieve");
			System.out.println("Enter Choice");
			int choice1 = sc.nextInt();
			buser2.transaction(amt1, t1, choice1, a1);
			break;
			
			case 3333 : BankUser buser3 = b1.login(pin);
			System.out.println("Enter Amount");
			double amt2 = sc.nextDouble();
			System.out.println("1. Send 2. Recieve");
			System.out.println("Enter Choice");
			int choice2 = sc.nextInt();
			buser3.transaction(amt2, t1, choice2, a1);
			break;
			}
			
	}
}
