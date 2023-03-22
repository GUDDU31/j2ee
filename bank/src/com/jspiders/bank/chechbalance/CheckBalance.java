package com.jspiders.bank.chechbalance;

import com.jspiders.bank.account.Account;

public class CheckBalance {
Account account;
	
	public CheckBalance() {
	System.out.println(this.balance(Account.getobject()));
	}

	public double balance(Account account) {
		this.account=account;
		return account.accountBalance;
	}

}
