package kr.co.korea.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.korea.beans.UserBean;

@Controller
public class HomeController {
	
//	@Resource(name="loginUserBean")
//	private UserBean loginUserBean;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(HttpServletRequest request) {
//		System.out.println(loginUserBean);
		System.out.println(request.getServletContext().getRealPath("/"));  //실제경로확인
		return "redirect:main";
	}
}
