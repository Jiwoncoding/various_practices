package com.icia.java2;

public class TV {
	// 객체가 가진 값 : 필드
	private int volume;
	private int channel;
	private final int MAX_VOLUME=32;
	private final int MIN_VOLUME = 0;
	private final int MAX_CHANNEL = 999;
	private final int MIN_CHANNEL = 0;
	
	// 필드를 변경하는 메소드 
	public void volumeUp() {
		if(this.volume<this.MAX_VOLUME) 
			this.volume++;
	}
	
	public void voluemDown() {
		if(this.volume>this.MIN_VOLUME)
			this.volume--;
	}
	
	public void channelUp() {
		if(this.channel<this.MAX_CHANNEL)
			this.channel++;
	}
	
	public void channelDown() {
		if(this.channel>this.MIN_CHANNEL) 
			this.channel--;
	}
	
	public void powerOn() {
		this.channel = 0;
		this.volume = 15;
	}
	
	// getter
	public int getChannel() {
		return this.channel;
	}
	
	public int getVolume() {
		return this.volume;
	}
}
