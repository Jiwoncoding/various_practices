package com.icia.example1;

// 필드값이 외부에 노출되어 있다
class Saram {
	int 키;
	int 체중;
}
public class Test1 {
	public static void main(String[] args) {
		Saram s = new Saram();
		s.키 = 185;
		s.체중 = 70;
		
		// 지나가던 내가 기분나빠서
		s.키=170;
		s.체중 = 85;
	}
}
