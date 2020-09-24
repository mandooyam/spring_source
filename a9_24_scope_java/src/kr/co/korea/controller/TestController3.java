package kr.co.korea.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.korea.beans.DataBean1;
import kr.co.korea.beans.DataBean2;
import kr.co.korea.beans.DataBean3;
import kr.co.korea.beans.DataBean4;

@Controller
//@SessionAttributes("bean6")
@SessionAttributes({ "bean6", "bean7", "bean77" })
public class TestController3 {
//(0) HttpRequest에서 세션정보 가져와서 HttpSeesion에 저장하고 설정
	@GetMapping("/test0")
	public String test0(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("name0", "처음사용자0");
		return "test0";
	}

	@GetMapping("/result0")
	public String result0(HttpServletRequest request) {
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("name0"));
		return "result0";
	}

//(1) HttpSession에서 설정
	@GetMapping("/test1")
	public String test1(HttpSession session) {
		session.setAttribute("name1", "홍길동1");
		return "test1";
	}

	@GetMapping("/result")
	public String result(HttpSession session) {
		return "result";
	}

	// ----------------------------------------------------------
	// (2) 리다이렉트
	@GetMapping("/test2")
	public String test2(HttpSession session) {
		session.setAttribute("name2", "최고야2");
		return "redirect:/result";
	}

	// (3) 포워드
	@GetMapping("/test3")
	public String test3(HttpSession session) {
		session.setAttribute("name3", "김삼묘3");
		return "forward:/result";
	}

	// ----------------------------------------------------------
	// (4) 데이터빈 객체 생성
	@GetMapping("test4")
	public String test4(HttpSession session) {
		DataBean1 bean1 = new DataBean1();
		bean1.setId("400");
		bean1.setPw("444");
		session.setAttribute("bean4", bean1);
		return "result";
	}

	// ----------------------------------------------------------
	// (5) 이미 Session에 bean4객체로 저장된것을 bean1로 주입받아서 값변경하고 session객체로 bean4사용
	@GetMapping("/test5")
	public String test5(@SessionAttribute("bean4") DataBean1 bean1) {
		bean1.setId("500");
		bean1.setPw("555");
		return "result";
	}

	// ----------------------------------------------------------
	// (6) 클래스위에 @SessionAttributes("bean6") 사용을 선언해야 함
	// bean6을 모델객체로 사용할 수 있도록 정의해두어야 함
	@ModelAttribute("bean6")
	public DataBean1 dataBean1() {
		return new DataBean1();
	}

	// (6) bean6을 DataBean1 bean1로 주입하여 사용하여 모델객체는 bean6리턴
	@GetMapping("/test6")
	public String test6(@ModelAttribute("bean6") DataBean1 bean1) {
		bean1.setId("600");
		bean1.setPw("666");
		return "result";
	}

	// ----------------------------------------------------------
	// (7) 클래스위에@SessionAttributes({"bean6","bean7","bean77"})사용을 선언
	// bean7, bean77 을 모델객체로 사용할 수 있도록 정의해두어야 함
	@ModelAttribute("bean7")
	public DataBean1 dataBean7() {
		return new DataBean1();
	}

	@ModelAttribute("bean77")
	public DataBean2 dataBean77() {
		return new DataBean2();
	}

	// (7) bean7을 DataBean1 bean1로 주입하여 사용하여 모델객체는 bean7
	// bean77을 DataBean2 bean2로 주입하여 사용하여 모델객체는 bean77
	@GetMapping("/test7")
	public String test7(@ModelAttribute("bean7") DataBean1 bean1, @ModelAttribute("bean77") DataBean2 bean2) {
		bean1.setId("700");
		bean1.setPw("777");
		bean2.setName("칠칠이");
		bean2.setJuso("칠곡");
		return "result";
	}

	// ----------------------------------------------------------
	// (8) RootAppContext.java에 Bean객체로 SessionScope으로 지정할 경우
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
	// (9) 컨트롤러의 클래스 상단에 컴포넌트로 SessionScope로 지정할 경우
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
