package com.icia.java2;

// 객체지향 이전의 언어들은 이름은 반드시 달라야 한다
// 자바의 함수는 파라미터가 다르다면 이름이 같아도 된다
class BeforeOOP {
	int sumIntAndInt(int x, int y) {
		return x+y;
	}
	double sumIntAndDouble(int x, double y) {
		return x+y;
	}
	double sumDoubleAndInt(double x, int y) {
		return x+y;
	}
	int sum3(int x, int y, int z) {
		return x+y+z;
	}
	int sum4(int x, int y, int z, int a) {
		return x+y+z+a;
	}
}
public class OverloadTest {

}
