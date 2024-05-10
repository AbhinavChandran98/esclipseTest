package com.jsp.bank.account;

public class AccountClose {
	/**
	 * deactivate the given account
	 * @param a1
	 */
	public void deactivate(Account a1) {
		System.out.println("Deactivating the account");
		a1.setActive(false);
	}
}
