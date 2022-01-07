package com.icia.example2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder			// 객체 생성을 도와주는 메소드를 만들어라
public class Cha {
	private String model;
	private String color;
	private int maxSpeed;
}
