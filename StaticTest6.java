package com.icia.example2;

// 객체를 생성한다는 것은 내용과 동작이 다르다
// 내용과 동작이 같다면 객체를 생성할 이유가 없다
class Saram1 {
	static int get수령액(int sal, int bonus) {
		return sal + bonus;
	}
}

class Saram2 {
	int sal = 2000000;
	int bonus = 1000000;
	int get수령액() {
		return this.sal + this.bonus;
	}
}

public class StaticTest6 {
	public static void main(String[] args) {
		System.out.println(Saram1.get수령액(2000000, 1000000));
		
		Saram2 s2 = new Saram2();
		System.out.println(s2.get수령액());
		
	}
}
