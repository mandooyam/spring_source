package kr.co.korea.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

public class TestController {

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1(HttpServletRequest request, HttpServletResponse response) { //전통적인 방법
		// request: 값을 받아오는...

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String hobby[] = request.getParameterValues("hobby");
		System.out.println("test1");
		System.out.println(id);
		System.out.println(name);
		for (String str : hobby) {
			System.out.println(str);
		}

		return "/test1";
	}

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2(HttpServletRequest request, HttpServletResponse response) {

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String hobby[] = request.getParameterValues("hobby");
		System.out.println("test2");
		System.out.println(id);
		System.out.println(name);
		for (String str : hobby) {
			System.out.println(str);
		}

		return "/test2";
	}

	@GetMapping("/test3")
	public String test3(WebRequest request) { // WebRequest 클래스 통하여 주입
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String hobby[] = request.getParameterValues("hobby");
		System.out.println("test3");
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		for (String str : hobby) {
			System.out.println("hobby:" + str);
		}
		return "result";
	}

	@GetMapping("/test4/{id}/{name}/{hobby}")
	public String test4(@PathVariable int id, @PathVariable int name, @PathVariable int hobby) {
		System.out.println("test4");
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("hobby:" + hobby);
		int add = id + name + hobby;
		System.out.println("add:" + add);
		return "result";
	}

	@GetMapping("/test5") 
	public String test5(@RequestParam int id, @RequestParam int name, @RequestParam int[] hobby) {
		System.out.println("test5");
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		for (int str : hobby) {
			System.out.println("hobby:" + str);
		}
		return "result";
	}

	@GetMapping("/test6")
	public String test6(@RequestParam(value = "id") int value1, @RequestParam(value = "name") int value2,
			@RequestParam(value = "hobby") int[] value3) {
		System.out.println("test6");
		System.out.println("id:" + value1);
		System.out.println("name:" + value2);
		for (int str : value3) {
			System.out.println("hobby:" + str);
		}
		return "result";
	}

	@GetMapping("/test7")
	public String test7(@RequestParam int id, @RequestParam(required = true) String name,
			@RequestParam(defaultValue = "0") int hobby) {
		System.out.println("test7");
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("hobby:" + hobby);
		return "result";
	}

	@GetMapping("/test8")
	public String test1(@RequestParam Map<String, String> map) {
		String id = map.get("id");
		String name = map.get("name");
		System.out.println("test8");
		System.out.printf("id :%s\n", id);
		System.out.printf("name :%s\n", name);
		return "result";
	}

}
