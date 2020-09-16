package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="board/write", method=RequestMethod.GET)
	public String write() {
		return "board/write";
	}
	
	@RequestMapping(value="board", method=RequestMethod.GET)
	public String list() {
		return "board/list";
	}
}
