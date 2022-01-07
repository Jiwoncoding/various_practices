package com.icia.example2;

class MyMath {
	int x;
	int y;
	MyMath(int x, int y) {
		this.x = x;
		this.y = y;
	}
	int sum() {
		return this.x + this.y;
	}
}

class MyMath2 {
	static int sum(int x, int y) {
		return x + y;
	}
}
public class StaticTest7 {
	public static void main(String[] args) {
		MyMath math1 = new MyMath(10, 20);
		System.out.println(math1.sum());
		System.out.println(MyMath2.sum(10, 20));
	}
}
