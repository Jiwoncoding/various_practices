package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	// 로그인 처리는 스프링 시큐리티가 담당, 로그인 페이지는 커스터마이즈 가능
	// 로그인 페이지를 보여줄 주소
	@GetMapping("/sample/login")
	public void login() {
	}
	
	// 기본 페이지
	@GetMapping("/sample/list")
	public void list() {
	}
}
