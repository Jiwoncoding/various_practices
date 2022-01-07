package com.icia.example1;

// Value Object(VO) 클래스
// 현실 세계의 회원을 Member 클래스로 모델링하려고 합니다. 회원의 데이터로는 이름, 아이디, 패스워드,
// 나이가 있습니다. 필드, 생성자, 메소드를 작성하시오 
public class Member {
	private String name;
	private String username;
	private String password;
	private int age;
	
	// 스프링에서 사용하는 객체는 기본 생성자가 필요
	public Member() {
	}
	
	public Member(String name, String username, String password, int age) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}
	
}
