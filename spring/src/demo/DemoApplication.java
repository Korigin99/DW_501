package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	/*
	 * 어플리케이션(소프트웨어 프로그램)을 만들 떄 패키지 3개부터 시작
	 * com.example.demo
	 * 1번째 패키지 이름 : .net, .com, .kr
	 * 2번째 패키지 이름 : 조직이름 ex) naver, dw
	 * 3번째 패키지 이름 : 프로젝트 이름 ex) game, admin
	 * 
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
