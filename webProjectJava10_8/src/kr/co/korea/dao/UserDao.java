package kr.co.korea.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.korea.beans.UserBean;
import kr.co.korea.mapper.UserMapper;

@Repository
public class UserDao {

	@Autowired
	private UserMapper userMapper;
	public String checkUserIdExist(String user_id) {
		return userMapper.checkUserIdExist(user_id);
	}
	
//mapper의 addUserInfor 호출하도록 정의	
	public void addUserInfo(UserBean joinUserBean) {
		userMapper.addUserInfo(joinUserBean); //mapper의 addUserInfor호출
	}
//mapper의 getLoginUserInfo 호출하도록 정의		
	public UserBean getLoginUserInfo(UserBean tempLoginUserBean) {
		return userMapper.getLoginUserInfo(tempLoginUserBean); //mapper의 getLoginUserInfo호출
	}	
//mapper의 getModifyUserInfo 호출하도록 정의		
	public UserBean getModifyUserInfo(int user_idx) {
		return userMapper.getModifyUserInfo(user_idx);
	}
	
	public void modifyUserInfo(UserBean modifyUserBean) {
		userMapper.modifyUserInfo(modifyUserBean);
	}
}
