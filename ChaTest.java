package com.icia.example2;

public class ChaTest {
	public static void main(String[] args) {
		Cha cha = new Cha("트럭", "흰색", 150);
		System.out.println(cha.getColor());
		System.out.println(cha.getMaxSpeed());
		
		// 객체를 생성하는 작업은 예상외로 복잡할 수 있다
		Cha cha2 = new Cha("검정색", "버스", 200);
		System.out.println(cha2.getColor());
		
		Cha cha3 = Cha.builder().model("버스").color("빨강").maxSpeed(150).build();
		
		// 노랑색, 최고속도 200짜리 Cha를 만드시오
		Cha cha4 = Cha.builder().color("노랑").maxSpeed(200).build();
		System.out.println(cha4.getModel());
	}
}
