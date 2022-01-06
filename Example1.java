package com.icia.java2;

public class Example1 {
	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV();
		// 메인을 실행하면 참조 변수 2개와 객체 2개가 만들어진다
		
		System.out.println(tv1.hashCode());
		System.out.println(tv2.hashCode());
		
		// ==를 객체를 비교하면 hashCode를 비교한다
		System.out.println(tv1==tv2);
		System.out.println(tv1==tv1);
		
		// 객체의 값을 비교하는 equals 메소드가 준비되어 있다
		// equals도 hashCode를 비교한다 -> 프로그래머가 커스터마이즈할 수 있다(override)
		System.out.println(tv1.equals(tv2));
		System.out.println(tv1.equals(tv1));
	}
}
