package com.lear.multithreading;

public class Account {
double accountBalance;


public Account(double accountBalance) {
	this.accountBalance = accountBalance;
}

public double checkBalance() {
return this.accountBalance;	
}

public void deposit(double amount) {
	System.out.println("Depositing "+amount+" int the account");
	accountBalance+=amount;
	System.out.println("current banlance: "+checkBalance());
}

public void withdraw(double debit) {
	System.out.println("Debited "+debit+" from the account");
	accountBalance-=debit;
	System.out.println("current banlance: "+checkBalance());
	
}
}
