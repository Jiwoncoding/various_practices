package com.icia.example2;

class Sample4 {
	int a = 10;
	static int b = 20;
	
	void func1() {
		// 같은 일반멤버인 func1, a는 객체를 생성할 때 같이 태어난다 -> func1은 a를 사용할 수 있다
		a++;
		// 정적 멤버가 형이다
		b++;
	}
	
	static void func2() {
		// 정적멤버인 func2는 b와 함께 태어났다
		b++;
		
		// func2가 사용가능 할때 a는 반드시 존재한다(X) -> 접근 불가능
		a++;
	}
}

public class StaticTest4 {
	public static void main(String[] args) {
		/*
		Sample4 s1 = new Sample4();
		Sample4 s2 = new Sample4();
		// 현재 a라는 필드는 2개 있다, 공유 필드 b는 1개가 있다
		*/
		
		// 현재 a필드는 존재하지 않는다(일반필드는 객체를 만들어야 태어난다)
		System.out.println(Sample4.b);
	}
}
