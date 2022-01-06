package com.icia.java;

import java.time.LocalDate;
// 자바를 실행하면 자기가 가진 클래스를 자동으로 읽어오지 않는다(너무 많다)
// 어떤 패키지의 무슨 클래스를 읽어오라고 명령해야 읽어온다
// 단 java.lang 패키지는 import없이 사용할 수 있다
import java.util.Date;

public class Example3 {
	public static void main(String[] args) {
		// 변수의 종류 : 기본타입, 참조타입(리모콘)
		// 기본타입 - 정수, 실수, boolean, char
		// 참조타입 - 객체를 가리키는 4바이트 리모콘(실제 가진 값은 int와 같다)
		// 1. new를 이용해 객체를 만들고 그 객체를 가리킨다
		Date d1 = new Date();
		
		// 2. 문자열의 경우 new를 사용하지 않는다
		String str = "Hello";
		
		// 3. java8이후에 추가된 클래스의 경우 객체를 생성하는 메소드를 가지고 있는 경우가 많다
		LocalDate d2 = LocalDate.of(2010, 11, 20);
		LocalDate d3 = LocalDate.now();
		
		
	}
}
