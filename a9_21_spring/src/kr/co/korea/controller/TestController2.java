package kr.co.korea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.korea.beans.DataBean;
import kr.co.korea.database.MapperSql;

@Controller
public class TestController2 {
	
	@Autowired
	MapperSql mapper1;
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping("/result")
	public String result(DataBean dataBean) {
		// System.out.println(dataBean.getId());
		mapper1.insert_data(dataBean);
		return "result";
	}
}
