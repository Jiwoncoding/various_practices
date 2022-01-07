package com.icia.example2;

// 필드를 초기화하는 방법과 그 순서
// instance : 설계도에서 찍어내는 것
//		int a;	a는 int의 인스턴스
//		excel을 실행했다면 실행된 엑셀은 엑셀 프로그램의 인스턴스
//		따라서 객체는 클래스의 인스턴스
class Sample3 {
	// 인스턴스 초기화. 우선순위 1위
	int a = 10;
	int nai = 1;
	static int b;
	
	// static 초기화 영역(static initializer) - 우선순위 2위
	static {
		System.out.println("===== static 초기화 ====");
		//a = 30;			static { }에서는 일반 멤버를 사용할 수 없다
		b = 20;
	}

	Sample3() {
		a = 30;
		b = 20;				// 일반 메소드에서 static 멤버를 변경하는 것은 가능하지만 권장하지 않는다 
	}
}

public class StaticTest3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 프로그램를 실행하면 하드디스크에 저장된 프로그램을 읽어온 다음 실행한다
		// 클래스도 읽어들인다음 객체를 생성한다
		
		// 클래스를 읽어들인다 -> 정적 멤버까지 생성한다
		Class clz = Class.forName("com.icia.example2.Sample3");
		
		// 객체를 생성한다
		// Sample3 sample3 = (Sample3)clz.newInstance(); 
		
		// System.out.println(sample3.a);
		
	}
}
