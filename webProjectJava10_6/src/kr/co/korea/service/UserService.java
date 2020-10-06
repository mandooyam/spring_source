package kr.co.korea.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.korea.beans.UserBean;
import kr.co.korea.dao.UserDao;

@Service
public class UserService {


	@Autowired
	private UserDao userDao;
	
	@Resource(name = "loginUserBean")
	private UserBean loginUserBean;
	
	
	public boolean checkuserIdExist(String user_id) {
		String user_name=userDao.checkUserIdExist(user_id);
		if(user_name==null) {
			return true;    
		} else {
			return false;
		}
	}
//UserDao의 addUserInfo() 호출하도록 정의	
	public void addUserInfo(UserBean joinUserBean) {
		userDao.addUserInfo(joinUserBean);     //UserDao의 addUserInfo()호출
	}
	
//UserDao의 getLoginUserInfo() 호출하도록 정의		
	public void getLoginUserInfo(UserBean tempLoginUserBean) {
		
		UserBean tempLoginUserBean2 = userDao.getLoginUserInfo(tempLoginUserBean);  //UserDao의  getLoginUserInfo()호출
		
		if(tempLoginUserBean2 != null) { //db에서 select된게 있으면 
			loginUserBean.setUser_idx(tempLoginUserBean2.getUser_idx());
			loginUserBean.setUser_name(tempLoginUserBean2.getUser_name());
			loginUserBean.setUserLogin(true);
		}
	}
//UserDao의 getModifyUserInfo() 호출하도록 정의		
	public void getModifyUserInfo(UserBean modifyUserBean) {
		UserBean tempModifyUserBean = userDao.getModifyUserInfo(loginUserBean.getUser_idx());
		
		modifyUserBean.setUser_id(tempModifyUserBean.getUser_id());
		modifyUserBean.setUser_name(tempModifyUserBean.getUser_name());
		modifyUserBean.setUser_idx(loginUserBean.getUser_idx());
	}
	
	public void modifyUserInfo(UserBean modifyUserBean) {
		
		modifyUserBean.setUser_idx(loginUserBean.getUser_idx());
		
		userDao.modifyUserInfo(modifyUserBean);
	}
	
	
}
