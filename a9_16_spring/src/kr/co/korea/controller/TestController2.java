package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController2 {
	
	@PostMapping("board/write")
	public String write(@RequestParam String name, 
			@RequestParam String kor, @RequestParam String mat, @RequestParam String eng) {
		
		//과제
		System.out.println("이름: "+name); //이름, 총점
		System.out.println("국어: "+kor);
		System.out.println("수학: "+mat);
		System.out.println("영어: "+eng);
		int total = Integer.parseInt(kor)+Integer.parseInt(mat)+Integer.parseInt(eng);
		System.out.println("총점: "+total);
		return "result";
	}
}
