package kr.co.korea.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import kr.co.korea.beans.DataBean1;
import kr.co.korea.beans.DataBean2;

@Controller
public class TestController {
	//--1-------------------------------------------------------
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		request.setAttribute("name1", "홍길동1");
		return "forward:/result1"; //return "redirect:/result1";
	}
	
	@GetMapping("/result1")
	public String result1() {
		return "result1";
	}
	//--2-------------------------------------------------------
	@GetMapping("/test2")
	public String test2(Model model) { //model-->request 변경
		model.addAttribute("name2", "최고야2");
		return "forward:/result2";
	}
	
	@GetMapping("/result2")
	public String result2() { 
		return "result2";
	}
	//--3-------------------------------------------------------
	@GetMapping("/test3")
	public ModelAndView test3(ModelAndView mv) { //mv-->request 변경
		mv.addObject("name3", "이기자3");
		mv.setViewName("forward:/result3");
		return mv;
	}
	
	@GetMapping("/result3")
	public String result3() { 
		return "result3";
	}
	//--4-------------------------------------------------------
	@GetMapping("/test4")
	public String test4(Model model) {
		DataBean1 bean1 = new DataBean1();
		bean1.setId("hong4");
		bean1.setPw("1234");
		model.addAttribute("bean1", bean1);
		return "forward:/result4";
	}
	
	@GetMapping("/result4")
	public String result4() {
		return "result4";
	}
	//--5-------------------------------------------------------
	@GetMapping("/test5")
	public String test5(@ModelAttribute("bean1") DataBean1 bean1) {
		bean1.setId("lee5");
		bean1.setPw("12345");
		return "forward:/result5";
	}
	
	@GetMapping("/result5")
	public String result5() { 
		return "result5";
	}
	//--6-------------------------------------------------------
	@Autowired //자동으로 주입받는다
	DataBean1 bean2;
	
	@Resource(name = "testBean2")
	DataBean2 bean22;
	
	@GetMapping("/test6")
	public String test6() {
		bean2.setId("chichi");
		bean2.setPw("123456");
		bean22.setJuso("대구");
		bean22.setName("홍길동");
		return "forward:/result6";
	}
	
	@GetMapping("/result6")
	public String result6(Model model) {
		model.addAttribute("bean2", bean2);
		model.addAttribute("bean22", bean22);
		return "result6";
	}
}
