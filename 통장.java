package com.icia.example1;

public class 통장 {
	// 두 객체가 있다면 일반 필드는 값이 달라야한다
	int balance;
	
	// 금리 : 모든 통장의 금리는 각각, 변경가능하다
	// double interest;
	
	// 모든 통장의 금리는 각각이고, 변경불가능하다
	// 각각 -> 모두 다르다 -> 생성자가 필드를 초기화
	// final은 생성자에서 초기화할 수 있는 상수
	final double interest;
	
	// 기본금리는 모든 객체가 공유하는 값
	static double baseInterest = 0.01;
	
	// 실질금리는 모든 객체가 공유하는 상수다(생성자 초기화 불가능)
	final static double realInterest = 0.015;
	
	// final은 생성자에서 초기화(그래야 객체마다 값이 달라진다)
	public 통장() {
		this.interest = 0.025;
		
		// static은 모든 객체가 똑같은 값을 가진다 -> 생성자에서 초기화할 필요가 없다
		// this.baseInterest = 0.01;
	}
}





