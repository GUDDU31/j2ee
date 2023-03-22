package com.jspiders.bank.withdraw;

import com.jspiders.bank.account.Account;

public class Withdraw {
double withdrawamount;
	
	Account account;

	public Withdraw(double withdrawamount) {
		this.withdrawamount = withdrawamount;
		this.withdrawamount(Account.getobject());
	}
	
	public void withdrawamount(Account account)
	{
		this.account=account;
		account.accountBalance-=this.withdrawamount;
		
		System.out.println("the amount withdrawing "+this.withdrawamount
				 +"the remaining balance"+account.accountBalance);
	}

}
