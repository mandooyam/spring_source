package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/t1")
	public String test1() {
		return "test1";
	}
	
	@PostMapping("/t2")
	public String test2() {
		return "test2";
	}
	
}
