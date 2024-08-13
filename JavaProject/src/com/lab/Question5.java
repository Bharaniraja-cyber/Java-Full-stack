package com.lab;
import java.util.Scanner;
class BankAccount{
	void Deposit(int cash) {
		System.out.println("Deposit Amount : "+cash);
	}
	void withdraw(int Amount) {
		System.out.println("Cash Withdrawed is "+Amount);
	}
}

class SavingsAccount extends BankAccount{
	void withdraw(int Amount) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to Withdraw : ");
		Amount = sc.nextInt();
		if(Amount>100) {
			System.out.println("Cash Withdrawed is "+ Amount);
		}
		else {
			System.out.println("Minimum Amount Required");
		}
	}
}


public class Question5 {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.Deposit(1200);
		bank.withdraw(1000);
		
		BankAccount with = new SavingsAccount();
		with.Deposit(1000);
		with.withdraw(150);
	}

}
