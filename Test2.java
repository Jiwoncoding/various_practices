package com.icia.example1;

public class Test2 {
	public static void main(String[] args) {
		MyDate m1 = new MyDate();
		
		// 객체 println : 클래스 이름과 16진수 해시코드
		System.out.println(m1.printDate());
		
		MyDate m2 = new MyDate(2022, 10, 20);
		System.out.println(m2.printDate());
	}
}
