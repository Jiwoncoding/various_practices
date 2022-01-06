package com.icia.java2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class 계좌Test {
	@Test
	public void 입금Test() {
		계좌 account = new 계좌();
		assertEquals(true, account.deposit(1000));
		assertEquals(1000, account.checkBalance());
	}
	
	@Test
	public void 출금Test() {
		계좌 account = new 계좌();
		// 테스트할 때는 실패같이 테스트해야 한다
		assertEquals(false, account.withdraw(500));
		assertEquals(true, account.deposit(10000));
		assertEquals(true, account.withdraw(500));
		assertEquals(9500, account.checkBalance());
	}
}
