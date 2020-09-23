package kr.co.korea.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.korea.beans.DataBean;
//import kr.co.korea.database.MapperSql;

@Controller
public class TestController {
	
	@Autowired
	SqlSessionTemplate sqltemp;
	
	//---가입---------------------------------------------
	@GetMapping("/write")
	public String write() {
		return "write";
	}
	
	@GetMapping("/result")
	public String result(DataBean dataBean) {
		sqltemp.insert("test_db.insert_data", dataBean);
		return "result";
	}
	//---------------------------------------------------
	
	@GetMapping("/show")
	public ModelAndView show(ModelAndView mv) {
		List<DataBean> list = sqltemp.selectList("test_db.select_data");
		mv.addObject("list", list);
//		List<DataBean> list = mapper1.select_data();
//		mv.addObject("list", list);
		
		int cnt = sqltemp.selectOne("test_db.select_one");
		mv.addObject("cnt", cnt);
//		int cnt = mapper1.select_one();
//		mv.addObject("cnt", cnt);
		
		mv.setViewName("show");
		return mv;
	}
	
//	@GetMapping("/show")
//	public String show(Model model) {
//		List<DataBean> list = mapper1.select_data();
//		model.addAttribute("list", list);
//		return "show";
//	} 
	
	//---과제2--------------------------------------------
	@GetMapping("/edit")
	public String edit() {
		return "edit";
	}
	
	@GetMapping("/result2")
	public String result2(DataBean databean) {
		int res = sqltemp.update("test_db.update_data", databean);
		if(res==1) return "index";
		else return "edit";
	}
	
	@GetMapping("/del")
	public String del() {
		return "del";
	}
	
	@GetMapping("/result3")
	public String result3(DataBean databean) {
		int res = sqltemp.delete("test_db.delete_data", databean);
		if(res==1) return "index";
		else return "del";
	}
	
}
