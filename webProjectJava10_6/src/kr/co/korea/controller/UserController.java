package kr.co.korea.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.korea.beans.UserBean;
import kr.co.korea.service.UserService;
import kr.co.korea.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {

//userService 객체로 주입
	@Autowired
	private UserService userService;
	
	@Resource(name = "loginUserBean")
	private UserBean loginUserBean;
	
	@GetMapping("/login")
	public String login(@ModelAttribute("tempLoginUserBean") UserBean tempLoginUserBean,
						@RequestParam(value = "logcheck", defaultValue = "true") boolean logcheck,
						Model model) {
		
		model.addAttribute("logcheck", logcheck);  //logcheck 
	
		return "user/login";
	}
	
	@PostMapping("/login_pro")
	public String login_pro(@Valid @ModelAttribute("tempLoginUserBean") UserBean tempLoginUserBean, BindingResult result) {
		
		if(result.hasErrors()) {
			return "user/login";
		}
		
		userService.getLoginUserInfo(tempLoginUserBean);   //db를 통해 조회된 idx,name select하기
		
		if(loginUserBean.isUserLogin() == true) {
			return "user/login_success";
		} else {
			return "user/login_fail";
		}
	}
	
	@GetMapping("/join")
	public String join(@ModelAttribute("joinUserBean") UserBean joinUserBean) {
		return "user/join";
	}
	
	@PostMapping("/join_pro")
	public String join_pro(@Valid @ModelAttribute("joinUserBean") UserBean joinUserBean, BindingResult result) {
		if(result.hasErrors()) {
			return "user/join";
		}
		
		//객체를 통해 service의 addUserInfo()메소드 호출
		userService.addUserInfo(joinUserBean); 
		
		return "user/join_success";
	}
	
	@GetMapping("/modify")
	public String modify(@ModelAttribute("modifyUserBean") UserBean modifyUserBean) {

		userService.getModifyUserInfo(modifyUserBean);

		return "user/modify";
	}

	@PostMapping("/modify_pro")
	public String modify_pro(@Valid @ModelAttribute("modifyUserBean") UserBean modifyUserBean, BindingResult result) {

		if (result.hasErrors()) {
			return "user/modify";
		}
		userService.modifyUserInfo(modifyUserBean);
		
		return "user/modify_success";
	}
	
	@GetMapping("logout")
	public String logout() {
		loginUserBean.setUserLogin(false);   //userLogin에 false값을 세트
		return "user/logout";
	}	
	
	@GetMapping("/not_login")
	public String not_login() {
		return "user/not_login";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		UserValidator validator1 = new UserValidator();
		binder.addValidators(validator1);
	}
	
}
