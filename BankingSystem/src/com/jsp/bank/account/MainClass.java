package com.jsp.bank.account;

public class MainClass {
	public static void main(String[] args) {
		AccountCreation ac=new AccountCreation();
		AccountClose ca=new AccountClose();
		
		Account a1= ac.createAccount("Ramesh","Saving", 20000.00);
		System.out.println(a1.getAccNum());
		
		Account a2=ac.createAccount("Suresh", "Saving", 10000.00);
		System.out.println(a2.getAccNum());
		
		System.out.println(a1.isActive());
		System.out.println(a2.isActive());
		
		ca.deactivate(a2);
		System.out.println(a2.isActive());
	}

}
