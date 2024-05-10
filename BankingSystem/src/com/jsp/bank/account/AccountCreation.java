package com.jsp.bank.account;

public class AccountCreation {
	private static int initAccNum=10001;
	//java docs
	/**
	 * This method used to create an account based on the given parameters
	 * @param custName
	 * @param accType
	 * @param accBal
	 * @return Account type object
	 */
	public Account createAccount(String custName,String accType,double accBal) {
		System.out.println("Creating an Account");
		return new Account(initAccNum++, accBal, custName, accType, true);
	}
}
