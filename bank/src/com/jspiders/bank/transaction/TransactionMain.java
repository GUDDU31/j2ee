package com.jspiders.bank.transaction;

import java.util.Scanner;
import com.jspiders.bank.chechbalance.CheckBalance;
import com.jspiders.bank.deposit.Deposit;
import com.jspiders.bank.withdraw.Withdraw;

public class TransactionMain {
public static void main(String[] args) {
	boolean loop = true;
	while (loop) {
		System.out.println(
				"==== Transaction =====\n" + "1 :Deposit\n" + "2 :Withdraw\n" + "3 :CheckBalance\n" + "4 :Exit");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose the transaction");

		int choose = scanner.nextInt();

		//ssscanner.close();

		switch (choose) {
		case 1:
			System.out.println("enter the amount");
			double dep=scanner.nextDouble();
            
			Deposit dep1=new Deposit(dep);
			
			System.out.println("Amount is Deposited Sucessfully :");
			break;
		case 2:
			System.out.println("enter the amount");
			
			double dep11=scanner.nextDouble();
			Withdraw wi1=new Withdraw(dep11);
			
			System.out.println("Amount is Withdrawn Sucessfully : ");

			break;
		case 3:
			System.out.println(" Current Balance is : ");
           
			CheckBalance ch=new CheckBalance();
			break;
		case 4:
			System.out.println("**** Thank You For Visiting Us ****");
			loop = false;
			break;
		default:
			break;
		}
		//scanner.close();
}
}
}
