package com.icia.example1;

import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) {
		ArrayList<Marine> list = new ArrayList<>();
		
		// 마린 10마리를 생성 (모든 마린의 방어력은 1)
		for(int i=0; i<10; i++) {
			list.add(new Marine());
		}
		
		// 5번째 마린의 방어력을 10으로 변경
		list.get(5).defence = 10;
		
		for(Marine m :list) {
			System.out.println(m.defence);
		}
		
		
	}
}
