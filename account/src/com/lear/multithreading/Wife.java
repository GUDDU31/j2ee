package com.lear.multithreading;

public class Wife extends Thread {
   Account account;
   public Wife(Account account) {
	   this.account=account;
   }
   public void run() {
	   account.deposit(500);
	   account.withdraw(1000);
   }
}
