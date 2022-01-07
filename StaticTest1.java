package com.icia.example2;

// static : 객체들이 공유한다 -> 클래스 소속
class Sample1 {
	int a;
	static int b = 100;
}

public class StaticTest1 {
	public static void main(String[] args) {
		Sample1 s1 = new Sample1();
		Sample1 s2 = new Sample1();
		s1.a = 10;
		Sample1.b = 20;
		System.out.println(s2.a);			// 0
		System.out.println(Sample1.b);		// 20
		
		// static 멤버인 b는 객체들이 공유한다 -> 즉 하나만 존재한다 -> 객체 소속이라고 말할 수 없다 
		// -> 클래스 소속
	}
}
