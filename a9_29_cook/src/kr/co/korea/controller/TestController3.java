package kr.co.korea.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.korea.beans.DataBean1;

@Controller
public class TestController3 {
//(1) spring 태그 라이브러리 이용
	@GetMapping("/input_data1")
	public String input_data1(DataBean1 dataBean1) {
		return "input_data1";
	}

	@PostMapping("/input_pro1")
	public String input_pro1(@Valid DataBean1 dataBean1, BindingResult result) {
		// 유효성 검사에서 위반된 부분이 있다면..
		if (result.hasErrors()) {
			for (ObjectError obj : result.getAllErrors()) {
//				System.out.println("DefaultMessage():" + obj.getDefaultMessage());
//				String[] codes = obj.getCodes();
//				for (String c1 : codes) {
//					System.out.println("codes:" + c1);
//				}
			}
			return "input_data1"; // 에러가 있으면
		} else
			return "input_success"; // 에러가 없으면
	}

//(2) Form 태그 라이브러리 이용
	@GetMapping("/input_data2")
	public String input_data2(DataBean1 dataBean1) {
		return "input_data2";
	}

	@PostMapping("/input_pro2")
	public String input_pro2(@Valid DataBean1 dataBean1, BindingResult result) {
		if (result.hasErrors()) {
			return "input_data2"; // 에러가 있으면
		} else
			return "input_success"; // 에러가 없으면
	}

}
