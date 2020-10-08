package kr.co.korea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.korea.beans.TestBean;
import kr.co.korea.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/insert")
	public String insert(@ModelAttribute("joinMemberBean") TestBean joinMemberBean) {
		return "insert";
	}
	
	@GetMapping("/delete")
	public String delete(@ModelAttribute("delMemberBean") TestBean delMemberBean) {
		return "delete";
	}
	
	@PostMapping("/insert_pro")
	public String insert_pro(@ModelAttribute("joinMemberBean") TestBean joinMemberBean) {
		testService.addMemberInfo(joinMemberBean);
		return "insert_pro";
	}
	
	@PostMapping("/delete_pro")
	public String delete_pro(@ModelAttribute("delMemberBean") TestBean delMemberBean) {
		testService.removeMemberInfo(delMemberBean);
		return "delete_pro";
	}
}
