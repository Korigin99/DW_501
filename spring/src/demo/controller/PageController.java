package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String callIndexPage() {
		return "index";
	}

	// 사용자(클라이언트)가 /home 주소를 입력하면
	// home 이름을 가진 html을 return 한다는 걸 의미.
	@GetMapping("/home")
	public String callHomePage(HttpServletRequest request) {
		String ip = request.getRemoteAddr();
		System.out.println("요청받은 IP : " + ip);
		return "home";
	}
	
	@GetMapping("/giwon")
	public String callGiownPage() {
		return "giwon";
	}
	
	@GetMapping("/movie")
	public String callMoviePage() {
		return "movie";
	}
	
	@GetMapping("/login")
	public String callLoginPage() {
		return "login";
	}

	@GetMapping("/login2")
	public String callLogin2Page() {
		return "login2";
	}
	
}
