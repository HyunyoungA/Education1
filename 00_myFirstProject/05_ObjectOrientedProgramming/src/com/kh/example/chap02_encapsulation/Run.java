package com.kh.example.chap02_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a= new Account();
		
		a.displayBalance();
		
		a.deposit(1000000);
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		a.withdraw(500000);
		a.displayBalance();
		
//		a.balance -= 2000000;
		//The field Account.balance is not visible
		
		a.withdraw(500000);
		a.displayBalance();
	}

}
