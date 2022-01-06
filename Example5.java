package com.icia.java;

public class Example5 {
	public static void main(String[] args) {
		// 자바의 경우 중괄호가 scope를 생성
		
		// js의 경우 변수를 만드는 방법
		//	x=10;						전역 소속
		//	var x=10;(ES5)				함수가 스코프를 생성
		// 	let x=10;(ES6)				중괄호가 스코프를 생성
		int x = 10;
		if(x>1) {
			int y=20;
			System.out.println(x);
			System.out.println(y);
		}
		System.out.println(x);
		System.out.println(y);
	}
}
