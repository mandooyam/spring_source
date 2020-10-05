package kr.co.korea.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class TestController2 {
	// (1) ArrayIndexOutOfBoundsException 에러있음
	@GetMapping("/test1")
	public String test1(Model model) {
		int[] array1 = { 10, 20, 30 };
		model.addAttribute("array1", array1[10]); // 에러
		return "test1";
	}

	// (2) NullPointerException 에러있음
	@GetMapping("/test2")
	public String test2() {
		ArrayList<String> list = null;
		list.add("문자열"); // 에러
		return "test2";
	}
	
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class) /* Exception.class */
	public String exception1() {
		return "error1";
	}

//	@ExceptionHandler(NullPointerException.class) /* Exception.class */
//	public String exception2() {
//		return "error2";
//	}

}
