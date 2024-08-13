package com.kh.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/* Spring Security
 * 
 * 클라이언트에서 서버로 요청이 들어갈때 요청을 막는다.
 * 접근허용시키는 키를 가지고있어야하고, 허용시키는 만큼만 허용한다. 
 * 
 * filterChain
 * 
 * .authorizeHttpRequests(authorize ->
 *	authorize.anyRequest().permitAll()
 * */

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	// 특정 http 요청에 대한 웹 기반 보안 구성. 인증/인가 및 로그아웃 설정
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http
				.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(authorize ->
					authorize
						//.requestMatchers("/register").authenticated() 허용한 사람만 접속가능
						.anyRequest().permitAll()
				)
				.build();
	}
	
	
	
}
