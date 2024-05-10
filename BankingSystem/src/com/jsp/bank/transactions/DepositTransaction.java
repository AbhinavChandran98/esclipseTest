package com.jsp.bank.transactions;

import com.jsp.bank.account.Account;

public class DepositTransaction {
	
	public void deposit(Account toAcc,double amount) {
		if(toAcc.isActive()) {
			System.out.println("Depositing Rs:"+amount+" into the account having accnum "+toAcc.getAccNum());
			toAcc.setAccBal(toAcc.getAccBal()+amount);
		}
		else {
			System.out.println("Amount is not active ,cannot do any transaction");
		}
	}
}
