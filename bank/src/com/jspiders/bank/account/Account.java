package com.jspiders.bank.account;

public class Account {
	public double accountBalance;
	static Account object;
	
	private Account (double accountBalance)
	{
		this.accountBalance=accountBalance;
	}
	
	public static Account getobject()
	{
		if(object == null)
		{
			object=new Account(10000);
		}
		return object;
	}

}
