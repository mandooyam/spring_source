package kr.co.korea.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test")
	public String test(HttpServletRequest request, Model model) {
		try {
			Cookie[] cookies = request.getCookies();
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("id"))
					model.addAttribute("id", cookie.getValue());
				if (cookie.getName().equals("name")) {
					String strname = URLDecoder.decode(cookie.getValue());
					model.addAttribute("name", strname);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "test";
	}

	@GetMapping("/login")
	public String save_cookie(HttpServletRequest request, HttpServletResponse response) {
		try {
			String id = URLEncoder.encode(request.getParameter("id"), "utf-8");
			String name = URLEncoder.encode("홍길동", "utf-8");
			Cookie cookid = new Cookie("id", id);
			Cookie cookname = new Cookie("name", name);
			cookid.setMaxAge(365 * 24 * 60 * 60);
			cookname.setMaxAge(365 * 24 * 60 * 60);
			response.addCookie(cookid);
			response.addCookie(cookname);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/test";
	}

	@GetMapping("/load_cookie")
	public String load_cookie(HttpServletRequest request, Model model) {
		try {
			Cookie[] cookies = request.getCookies();
			for (Cookie cookie : cookies) {
				String strname = cookie.getName();
				String strvalue = URLDecoder.decode(cookie.getValue(), "utf-8");
				System.out.println(strname + ":" + strvalue);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "load_cookie";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			Cookie cook = new Cookie(cookie.getName(), "");
			cook.setMaxAge(0);
			response.addCookie(cook);
		}
		System.out.println("모두삭제되었습니다.");
		return "redirect:/test";
	}

}
