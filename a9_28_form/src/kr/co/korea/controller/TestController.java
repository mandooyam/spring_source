package kr.co.korea.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.korea.beans.DataBean;
import kr.co.korea.beans.KeyValueBean;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(DataBean bean, Model model) {
		bean.setUid("hong");
		bean.setName("홍길동");
		bean.setPwd("hong");
		bean.setIntro("자신을 소개해주세요");
		bean.setJob("it");
		bean.setJob1("학생");
		bean.setJob2("시스템관리직");
		bean.setJob3("dba");
		// setHobby1 ~setHobby3 아래쪽에서
		bean.setGender1("male");
		bean.setGender2("male");
		bean.setGender3("male");
		bean.setLevel("대졸");

		// job_list1
		String[] job_list1 = { "기술자", "교사", "학생" };
		model.addAttribute("job_list1", job_list1);

		// job_list2
		ArrayList<String> job_list2 = new ArrayList<String>();
		job_list2.add("청소부");
		job_list2.add("서비스직");
		job_list2.add("시스템관리직");
		job_list2.add("DB관리직");
		model.addAttribute("job_list2", job_list2);

		// job_list3
		KeyValueBean key_bean1 = new KeyValueBean();
		KeyValueBean key_bean2 = new KeyValueBean();
		KeyValueBean key_bean3 = new KeyValueBean();
		key_bean1.setKey("프로그래머");
		key_bean1.setValue("programmer");
		key_bean2.setKey("관리자");
		key_bean2.setValue("manager");
		key_bean3.setKey("데이터베이스관리자");
		key_bean3.setValue("dba");
		ArrayList<KeyValueBean> job_list3 = new ArrayList<KeyValueBean>();
		job_list3.add(key_bean1);
		job_list3.add(key_bean2);
		job_list3.add(key_bean3);
		model.addAttribute("job_list3", job_list3);

		// hobby_list1
		String[] hobby_list1 = { "오락", "골프", "음식만들기" };
		model.addAttribute("hobby_list1", hobby_list1);

		// hobby_list2
		ArrayList<String> hobby_list2 = new ArrayList<String>();
		hobby_list2.add("만화책보기");
		hobby_list2.add("TV시청");
		hobby_list2.add("골프");
		hobby_list2.add("음식만들기");
		model.addAttribute("hobby_list2", hobby_list2);

		// hobby_list3
		key_bean1.setKey("기술책보기");
		key_bean1.setValue("itbook");
		key_bean2.setKey("골프");
		key_bean2.setValue("golf");
		key_bean3.setKey("음식만들기");
		key_bean3.setValue("food");
		ArrayList<KeyValueBean> hobby_list3 = new ArrayList<KeyValueBean>();
		hobby_list3.add(key_bean1);
		hobby_list3.add(key_bean2);
		hobby_list3.add(key_bean3);
		model.addAttribute("hobby_list3", hobby_list3);
		String hobby_list[] = { "game", "골프", "음식만들기" };
		bean.setHobby1(hobby_list);
		bean.setHobby2(hobby_list);
		bean.setHobby3(hobby_list);

		// test1.jsp의 gender1~gender3까지
		// radiobutton태그에 남자와 여자로 실습할것
		
		// level_list1
		String[] level_list1 = {"고졸","중졸","대졸"};
		model.addAttribute("level_list1", level_list1);
		
		return "test1";
	}
}
