package com.icia.example2;

public class Car {
	private String model;
	private String color;
	private int maxSpeed;
	
	// 생성자는 객체를 초기화한다 -> 객체마다 내용이 다르다
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 기본생성자 - 자가용, 검정, 200
	public Car() {
		this("자가용", "검정", 200);
	}
	
	public Car(String model) {
		// 생성자 호출은 첫 줄에서만 가능
		this(model, "검정", 200);
		
		//this.model = model;
		//this.color = "검정";
		//this.maxSpeed = 200;
	}
}
