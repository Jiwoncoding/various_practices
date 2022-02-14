package com.example.demo.controller;

import org.springframework.security.access.annotation.*;
import org.springframework.security.access.prepost.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController2 {
	// 로그인 처리는 스프링 시큐리티가 담당
	// 로그인 페이지도 /login 경로로 스프링 시큐리티가 제공한다
	// 로그인 여부로 메소드에 접근할 수 있는 지 설정 : @PreAuthorize, @PostAuthorize
	// 권한으로 메소드에 접근할 수 있는 지 설정 : @Secured
	// 위 어노테이션들은 메소드에 지정할 수도 있고 클래스에 지정할 수도 있다
	@PreAuthorize("isAnonymous()")
	@GetMapping("/sample2/login")
	public void login() {
	}
	
	// 누구나 접근 가능
	@GetMapping({"/", "/sample2/list"})
	public String list() {
		return "sample2/list";
	}
	
	@Secured("ROLE_USER")
	@GetMapping("/sample2/user")
	public void user() {
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/sample2/admin")
	public void admin() {
	}
	
	@PreAuthorize("isAuthenticated()")
	@GetMapping("/sample2/authenticated")
	public void authenticated() {
	}
	
	// 어노테이션은 클래스의 일종. 클래스처럼 어노테이션도 필드를 가질 수 있다
	// 모든 어노테이션은 value 필드를 가진다
	@PreAuthorize("isAnonymous()")
	@GetMapping(value="/sample2/anonymous")
	public void anonymous() {
	}
}
