package kr.co.korea.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
//(1)Properties파일을 @PropertySources을 이용하여 주입받기(jsp에서는 사용안됨)
@PropertySources(@PropertySource("/WEB-INF/properties/db.properties"))
public class TestController2 {

	@Value("${db.classname}")
	private String db_classname;
	@Value("${db.url}")
	private String db_url;
	@Value("${db.username}")
	private String db_username;
	@Value("${db.password}")
	private String db_password;
	
	@GetMapping("/test1")
	public String test1() {
	System.out.println(db_classname);
	System.out.println(db_url);
	System.out.println(db_username);
	System.out.println(db_password);
	return "test1";
	}
	
	//(2) ServletAppContext.java에 Properties파일을 Message로 등록하고 test2.jsp에서 바로 사용
	@GetMapping("/test2")
	public String test2() {
	return "test2";
	}
	
	//(3) ServletAppContext.java에 Properties파일을 Message로 등록하고, MesssageSource를 주입받아 컨트롤러 내에서 사용
	@Autowired
	ReloadableResourceBundleMessageSource res;
	
	@GetMapping("/test3")
	public String test3(Model model, Locale locale) {
		
	System.out.printf("locale :%s\n", locale);
	
	String a1=res.getMessage("dataBean1.id", null, null);
	String a2=res.getMessage("dataBean1.name", null, locale);
	System.out.println(a1);
	System.out.println(a2);
	
	 Object [] args= {30,"홍길동"};
	 String a3=res.getMessage("dataBean1.temp", args,null);
	 System.out.println(a3);
	model.addAttribute("args", args);
	return "test3";
	}

}
