package com.icia.java2;

public class Monitor {
	// 클래스의 멤버인 값 -> field
	private int size;
	private int bright;
	
	
	// 생성자(constructor) : 객체 생성 전용 메소드 - 객체 초기화. 공장초기화 목적으로 사용할 수 없다
	// 		생성자는 객체를 만들 때 사용하며 임의로 호출할 수 없다 vs 생성자는 호출이 불가능한다
	//		생성자의 이름 : 클래스 이름과 같다
	//		리턴값은 존재하지 않는다(void가 아니라 그런 거 없다)
	//	패키지 필수 -> 지정하지 않으면 소스를 저장한 현재 폴더가 패키지가 된다
	//	생성자는 필수 -> 안만들면 자바가 파라미터없는 생성자(기본 생성자)만들어준다
	public Monitor() {
		
	}
	
	// 메소드 - 필드를 읽고(getter) 쓰는(setter) 메소드
	public int getSize() {
		return size;
	}
	public int getBright() {
		return bright;
	}
	
	public void increaseBright() {
		bright+=5;
	}
	
	public void decreaseBright() {
		bright-=5;
	}
	
}
