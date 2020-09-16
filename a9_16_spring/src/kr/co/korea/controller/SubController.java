package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubController {
	@RequestMapping(value = "/test3", method = RequestMethod.POST)
	public String test3_post() {
		return "test3_post";
	}

	@GetMapping("test4")
	public String test4() {
		return "test4";
	}

	@PostMapping("test5")
	public String test5() {
		return "test5";
	}

	@RequestMapping(value = "/test6", method = { RequestMethod.GET, RequestMethod.POST })
	public String test7_post() {
		return "test6";
	}

}
