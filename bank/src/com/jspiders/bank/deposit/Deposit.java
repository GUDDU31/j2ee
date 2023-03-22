package com.jspiders.bank.deposit;

import com.jspiders.bank.account.Account;

public class Deposit {
	double depositAmount;
	Account account;
	public Deposit(double depositAmount) {
		this.depositAmount = depositAmount;
		
		this.depositamount(Account.getobject());
	}
	
	public void depositamount(Account account)
	{
		this.account=account;
		account.accountBalance+=depositAmount;
		System.out.println("depositing "+depositAmount+" the total balance is "+account.accountBalance);
	}

}
