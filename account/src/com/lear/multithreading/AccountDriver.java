package com.lear.multithreading;

public class AccountDriver {

	public static void main(String[] args) {
		Account account=new Account(2000);
		Husband husband=new Husband(account);
		Wife wife=new Wife(account);
		husband.start();
		wife.start();

	}

}
