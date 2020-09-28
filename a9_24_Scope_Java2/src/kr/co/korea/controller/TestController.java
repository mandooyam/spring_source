package kr.co.korea.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import kr.co.korea.beans.DataBean1;
import kr.co.korea.beans.DataBean2;
import kr.co.korea.beans.DataBean3;
import kr.co.korea.beans.DataBean4;

//@Controller
public class TestController {
	// (1) HttpRequest
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		request.setAttribute("name1", "공공");
		return "test1";
	}

	@GetMapping("/result")
	public String result(HttpServletRequest request) {
		String data1 = (String) request.getAttribute("name1");
		// System.out.println(data1);
		return "result";
	}

	// --------------------------------------------------------
	// (2) 리다이렉트
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		request.setAttribute("name2", "최고야2");
		return "redirect:/result";
	}

	// (3) 포워드
	@GetMapping("/test3")
	public String test3(HttpServletRequest request) // request로 전달받음
	{
		request.setAttribute("name3", "김삼묘3");
		return "forward:/result";
	}

	// ----------------------------------------------------------
	// (4) 데이터빈 객체 생성
	@GetMapping("/test4")
	public String test4(HttpServletRequest request) {
		DataBean1 bean1 = new DataBean1();
		bean1.setId("400");
		bean1.setPw("444");
		request.setAttribute("bean4", bean1);
		return "result";
	}

	// ----------------------------------------------------------
	// (5) DataBean1 객체 bean1로 설정후 --> 모델객체 bean5 로 리턴
	@GetMapping("/test5")
	public String test5(@ModelAttribute("bean5") DataBean1 bean1) // request로 전달받음
	{
		bean1.setId("500");
		bean1.setPw("555");
		return "result";
	}

	// ----------------------------------------------------------
	// (6) bean6을 DataBean1 bean1로 주입하여 사용하여 모델객체는 bean6
	@GetMapping("/test6")
	public String test6(Model model, DataBean1 bean1) {
		bean1.setId("600");
		bean1.setPw("666");
		model.addAttribute("bean6", bean1);
		return "result";
	}
	//ModelAndView mv 방법도 있음
	// ----------------------------------------------------------
	// (7) bean7객체로 request됨, bean77객체로 request
	@GetMapping("/test7")
	public String test7(@ModelAttribute("bean7") DataBean1 bean1, @ModelAttribute("bean77") DataBean2 bean2) {
		bean1.setId("700");
		bean1.setPw("777");
		bean2.setName("칠칠이");
		bean2.setJuso("칠곡");
		return "result";
	}

// ----------------------------------------------------------
//	 (8) RootAppContext.java에 Bean객체로 RequestScope으로 지정할 경우
	@Autowired
	DataBean1 bean8;
	
	@Resource(name = "testBean2")
	DataBean2 bean88;

	@GetMapping("/test8")
	public String test8(Model model) {
		bean8.setId("chichi");
		bean8.setPw("12345");
		bean88.setName("choi");
		bean88.setJuso("대구");
		model.addAttribute("bean8", bean8);
		model.addAttribute("bean88", bean88);
		return "result";
	}

	// ----------------------------------------------------------
	// (9) 컨트롤러의 클래스 상단에 컴포넌트로 RequestScope로 지정할 경우
	//  DataBean3과 DataBean4 내부에 @Component 상단에 적어야함 
	@Autowired
	DataBean3 bean9;
	@Resource(name = "testBean4")
	DataBean4 bean99;

	@GetMapping("/test9")
	public String test9(Model model) {
		bean9.setEng("100");
		bean9.setKor("100");
		bean9.setMat("100");
		bean99.setNo("100");
		bean99.setJumsu("대구");
		model.addAttribute("bean9", bean9);
		model.addAttribute("bean99", bean99);
		return "result";
	}
}
