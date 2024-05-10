package com.jsp.bank;

import com.jsp.bank.account.Account;
import com.jsp.bank.account.AccountClose;
import com.jsp.bank.account.AccountCreation;
import com.jsp.bank.transactions.DepositTransaction;

public class StartBankApp {
	public static void main(String[] args) {
		AccountCreation ac=new AccountCreation();
		AccountClose ca= new AccountClose();
		
		DepositTransaction dt=new DepositTransaction();
		
		Account a1=ac.createAccount("Ramesh","Saving",20000.0);
		Account a2=ac.createAccount("Suresh","Saving",10000.0);
		
		System.out.println("Before Deposit ,acc bal: "+a1.getAccBal());
		dt.deposit(a1, 5000);
		System.out.println("After Deposit ,accbal: "+a1.getAccBal());
		
		System.out.println("Before Deposit ,accbal: "+a2.getAccBal());
		dt.deposit(a2, 5000);
		System.out.println("After Deposit ,accbal: "+a2.getAccBal());
	}
}
