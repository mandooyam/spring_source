package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.korea.beans.UserDataBean;

@Controller
public class TestController2 {
	@GetMapping("test1")
	public String test1(UserDataBean bean) {
		bean.setUser_name("테스트1");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address("대구");
		return "test1";
	}
	
	@GetMapping("test2")
	public String test2(UserDataBean bean) {
		bean.setUser_name("테스트2");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address("대구");
		return "test2";
	}
	
	@GetMapping("test3")
	public String test3(@ModelAttribute("testBean") UserDataBean bean) {
		bean.setUser_name("테스트3");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address("대구");
		return "test3";
	}
	
	@GetMapping("test4")
	public String test4(Model model) {
		UserDataBean bean = new UserDataBean();
		bean.setUser_name("테스트4");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address("대구");
		
		model.addAttribute("bean4", bean);
		return "test4";
	}
	
	@GetMapping("/test5")
	public ModelAndView test5(ModelAndView mv) {
		UserDataBean bean = new UserDataBean();
		bean.setUser_name("테스트5");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address("대구");
		
		mv.addObject("bean5", bean);
		mv.setViewName("test5");
		return mv;
	}
	
	/*
	@GetMapping("/test5")
	public ModelAndView test5(ModelAndView mv, UserDataBean bean) { // OK
		bean.setUser_name("테스트5");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address("대구");
		
		mv.addObject("bean5", bean);
		mv.setViewName("test5");
		return mv;
	}
	*/
	
	//test6작성하되
	//주소만 "서울"바꾸기
	@PostMapping("/test6")
	public ModelAndView test6(ModelAndView mv, UserDataBean bean) {
		bean.setUser_address("서울");
		
		mv.addObject("bean6", bean);
		mv.setViewName("test6");
		return mv;
	}
	
	/*
	@PostMapping("/test6")
	public String test6(UserDataBean bean) {
		bean.setUser_address("서울");
		return "test6";
	}
	*/
}
