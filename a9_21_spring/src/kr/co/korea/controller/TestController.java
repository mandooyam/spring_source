package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


public class TestController {
	
//	@GetMapping("/test1")
//	public String test1() {
//		return "test1";
//	}
	
	@GetMapping("/test1")
	public String test1() {
		return "redirect:/sub1"; // 제어권이 넘어감
	}
	
	@GetMapping("/sub1")
	public String sub1() {
		return "sub1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "forward:/sub2";
	}
	
	@GetMapping("/sub2")
	public String sub2() {
		return "sub2";
	}
}
