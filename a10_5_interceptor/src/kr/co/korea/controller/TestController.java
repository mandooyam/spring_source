package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class TestController {

	@GetMapping("/user/modify")
	public String test1() {
		System.out.println("(2)/user/modify 컨트롤러");
		return "/user/modify";
	}

	@GetMapping("/user/logout")
	public String test2() {
		System.out.println("(2)/user/logout 컨트롤러");
		return "/user/logout";
	}

	@GetMapping("/board/write")
	public String test3() {
		System.out.println("(2)/board/write 컨트롤러");
		return "/board/write";
	}

	@GetMapping("/board/main")
	public String test4() {
		System.out.println("(2)/board/main 컨트롤러");
		return "/board/main";
	}

	@GetMapping("/board/modify")
	public String test5() {
		System.out.println("(2)/board/modify 컨트롤러");
		return "/board/modify";
	}

	@GetMapping("/board/delete")
	public String test6() {
		System.out.println("(2)/board/delete 컨트롤러");
		return "/board/delete";
	}

}
