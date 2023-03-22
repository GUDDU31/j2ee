package com.lear.multithreading;

public class Husband extends Thread{
Account account;

public Husband(Account account) {
	this.account = account;
}
public void run() {
	account.deposit(1200);
	account.withdraw(600);
}
}
