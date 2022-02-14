package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	// 스프링 시큐리티 설정파일이라면 스프링 시큐리티 표준 인터페이스를 implements 해야한다
	// 인터페이스를 implements하려면 모든 추상 메소드를 다 구현해야 한다
	// 그래서 메소드를 기본 구현한 중간 클래스를 두는 경우가 많다
	// 		Servlet 인터페이스 <- HttpServlet 추상 클래스(init, destory 기본구현) <- 내 서블릿
	// 이런 중간 클래스를 ~Adapter라고 한다
	
	// 1. 비밀번호 암호화 빈을 등록
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	// 스프링 시큐리티가 동작하지 않을 경로를 지정 : css, java script 등
	@Override
	public void configure(WebSecurity web) throws Exception {
		super.configure(web);
	}
	
	// 스프링 시큐리티 설정
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 1. 화면을 보여주고 아이디와 비밀번호를 입력하는 전통적인 로그인을 FormLogin을 활성화 - csrf 자동 활성화
		// 2. 로그인 페이지를 보여줄 주소(get)
		// 3. 로그인을 처리할 주소(post)
		// 4. login.html에서 아이디를 입력받을 name
		// 5. login.html에서 비밀번호를 입력받을 name
		// 6. 로그인에 성공하면 어느 페이지로 이동?
		// 7. 로그인에 실패하면 어느 페이지로 이동?
		http.formLogin().loginPage("/sample/login").loginProcessingUrl("/sample/login")
			.usernameParameter("username").passwordParameter("password")
			.defaultSuccessUrl("/sample/list").failureUrl("/sample/login?error");
		
		// 권한 오류에 대한 설정 - 403
		// 403이 발생하면 /sample/error로 이동해라
		http.exceptionHandling().accessDeniedPage("/sample/error");
		
		// 로그아웃에 대한 설정
		http.logout().logoutUrl("/sample/logout").logoutSuccessUrl("/sample/list");
	}
	
	// 사용자 아이디, 비밀번호, 권한등을 관리하는 AuthenticationManager 객체에 대한 설정
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("spring").password(passwordEncoder().encode("1234")).roles("USER")
			.and()
			.withUser("system").password(passwordEncoder().encode("1234")).roles("ADMIN");
	}
}
