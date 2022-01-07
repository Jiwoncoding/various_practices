package com.icia.example1;

public class Marine {
	//				업그레이드 가능
	// 체력은 40			X
	// 공격력 6			3업
	// 방어력 1			1업
	
	// static : 모든 객체가 공유 -> 생성자에서 초기화해서는 안된다
	// final : 초기화가능한 상수
	static final int hp = 40;
	static int attack = 6;
	static int defence = 1;
	
	// 메소드
	public void attackUpgrade() {
		if(attack<9) 
			attack++;
	}
	
	public void defenceUpgrade() {
		if(defence<=1)
			defence++;
	}
	
	public void attack() {
		System.out.println("공격력 " + attack + "으로 공격합니다");
	}
}
