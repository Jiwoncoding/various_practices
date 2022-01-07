package com.icia.example1;

import java.time.LocalDate;

// 필드와 메소드를 모아서 클래스를 만들고 가능한한 감춰라 : 캡슐화(encapsulation)
// 가능한한 private로 만들어서 보호하고 꼭 필요한 기능만 공개하라 : 정보 은닉(information hiding)
// 상속(inheritance)
// 다형성(polymorphism) : overload, override 
public class MyDate {
	// 필드
	private int year;
	private int month;
	private int day;
	
	// 메소드
	
	
	// 기본 생성자(default constructor) : 파라미터없는 생성자
	public MyDate() {
		LocalDate date = LocalDate.now();
		year =date.getYear();
		month = date.getMonthValue();
		day = date.getDayOfMonth();
	}
	
	// 생성자를 다양하게 제공하자
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public String printDate() {
		return this.year + "년 " + this.month + "월 " + this.day+ "일";
	} 
	
}
