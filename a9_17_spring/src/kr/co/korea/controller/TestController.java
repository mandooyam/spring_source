package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.korea.beans.DataBean;
import kr.co.korea.beans.dataBean1;

public class TestController {
	
	@PostMapping("/test1")
	public String test1(@ModelAttribute DataBean bean) { // @ModelAttribute 생략가능
		System.out.println("test1-------");
		System.out.println(bean.getData1());
		System.out.println(bean.getData2());
		return "test1";
	}
	
	@GetMapping("/test1")
	public String testx(@ModelAttribute DataBean bean) { // @ModelAttribute 생략가능
		System.out.println("test1-------");
		System.out.println(bean.getData1());
		System.out.println(bean.getData2());
		return "test1";
	}
	
	@PostMapping("/test2")
	public String test2(@ModelAttribute("testData") DataBean bean) { // DataBean -> testDate
		System.out.println("test2-------");
		System.out.println(bean.getData1());
		System.out.println(bean.getData2());
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(dataBean1 bean2) { // == @ModelAttribute DataBean bean
		System.out.println("test3-------");
		System.out.println(bean2.getId());
		System.out.println(bean2.getName());
		return "test3";
	}
}
