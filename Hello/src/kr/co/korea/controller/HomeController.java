package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "/WEB-INF/views/index.jsp";
	}
	
	@GetMapping("/t1")
	public String test1() {
		return "/WEB-INF/views/test1.jsp";
	}
	
	@PostMapping("/t2")
	public String test2() {
		return "/WEB-INF/views/test2.jsp";
	}
	
}
