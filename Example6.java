package com.icia.java;

public class Example6 {
	public static void main(String[] args) {
		//int x = 10000000000L;
		long y = 10000000000L;
		
		// 변수의 타입 변환
		// 같은 타입을 연산하면 결과도 그 타입
		// 정수 33을 정수 3으로 나누면 결과는 정수여야 한다
		double avg = 100/3;
		System.out.println(avg);
		
		// 서로 다른 타입을 연산하면 결과는 표현범위가 넓은 타입
		// 실수 100을 정수 3으로 나누면 결과는 표현범위가 넓은 실수가 된다
		double avg1 = (double)100/3;
		System.out.println(avg1);
		
		// 타입이 넓은 쪽으로는 자동으로 변환된다
		// 자바는 문법이 매우 엄격한 언어 : 100% 안전할 때만 예외(exception)를 내지 않는다
		//		exception: 프로그래머가 대응가능한 가벼운 오류
		//		error : 심각한 오류(예를 들어 자바가 맛이 갔어요....)
		short a = 10;
		int b = a;
		
		// 타입이 좁은 쪽으로는 수동으로 변환한다
		short c = (short)b;
		
	}
}
