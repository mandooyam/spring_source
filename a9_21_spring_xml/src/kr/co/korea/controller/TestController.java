package kr.co.korea.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.korea.beans.DataBean;

@Controller
public class TestController {
	
	@Autowired
	SqlSessionTemplate sqltemp;
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping("/result")
	public String result(DataBean dataBean) {
		sqltemp.insert("test_db.insert_data", dataBean);
		return "result";
	}
}
