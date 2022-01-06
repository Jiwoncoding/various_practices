package com.icia.java;

// 클래스 : 객체의 설계도
// 자바 함수는 클래스 소속이고 객체를 만든 다음에 사용 가능
// 클래스의 중괄호에 직접 속한 변수나 메소드를 멤버라고 한다

// Example2 클래스는 멤버가 2개 : a, member
public class Example2 {
	int a;
	public static void main(String[] args) {
		int b;	// 메소드 내부에 들었다 -> 멤버가 아니다. 지역변수
		Example2 ob = new Example2();
		
		// 메모리를 나눠서 사용하는 영역
		//			관리자		관리방식		
		// stack :   언어			 자동				프로그램이 시작하면 문법에 따라 생성하고 파괴		앱 전옹 메모리(소량)
		// heap	 :  프로그래머						필요할 때 필요한 만큼 사용 후 반납				공유 메모리
		
		// 멤버인 속성은 자동 초기화 -> heap
		System.out.println(ob.a);
		// 지역변수는 자동 초기화가 되지 않는다 -> stack
		System.out.println(b);
	}
}
