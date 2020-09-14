package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	@PostMapping("/home2")
	public String home2() {
		return "home2.jsp";
	}
}
