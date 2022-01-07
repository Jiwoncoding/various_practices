package com.icia.example2;

class Sample5 {
	int a = 10;
	static int b = 20;
	void func1() {
		// a, b 모두 사용 가능
		this.a++;
		this.b++;
	}
	static void func2() {
		// b만 사용 가능
	}
}
public class StaticTest5 {
	// 클래스는 일반 멤버와 정적 멤버로 구성된다
	// 일반 멤버는 객체를 생성해야(new) 사용 가능 - this를 가진다
	//		객체는 일반 멤버를 가지고 있고 이 일반 멤버는 this로 구별할 수 있다 
	// 정적 멤버는 객체를 생성하기 전부터 사용가능 - this를 가지지 않는다
}
