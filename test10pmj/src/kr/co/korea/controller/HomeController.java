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
	
	@GetMapping("/index")
	public String index2() {
		return "index";
	}
	
	
}
