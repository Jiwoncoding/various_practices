package com.icia.java2;

public class 계좌 {
	private int balance;
	
	// 입금
	public boolean deposit(int money) {
		this.balance+=money;
		return true;
	}
	
	// 출금
	public boolean withdraw(int money) {
		if(money>this.balance) 
			return false;
		this.balance-=money;
		return true;
	}
	
	public int checkBalance() {
		return this.balance;
	}
}
