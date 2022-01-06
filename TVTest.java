package com.icia.java2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TVTest {
	// 객체의 멤버 : 필드와 메소드. 필드와 메소드는 모두 형제
	//			  서로 자유롭게 접근가능
	//			  private은 외부에서 허락받은 사람만 접근할 수 있다
	TV tv = new TV();
	
	//@Test
	public void powerOnTest() {
		tv.powerOn();
		assertEquals(0, tv.getChannel());
	}
	
	//@Test
	public void channelUpTest() {
		TV tv = new TV();
		tv.channelUp();
		assertEquals(1, tv.getChannel());
	}
	
	// 볼륨업을 단위테스트하시오
	@Test
	public void volumeUpTest() {
		tv.volumeUp();
		assertEquals(16, tv.getVolume());
		tv.volumeUp();
		assertEquals(2, tv.getVolume());
	}
	
}
