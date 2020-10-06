package kr.co.korea.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.korea.beans.UserBean;

public interface UserMapper {

	@Select("select user_name "+
			"from user_table "+
			"where user_id= #{user_id}")
	 String checkUserIdExist(String user_id);

// 회원가입-저장처리(insert into user_table..)
	@Insert("insert into user_table (user_idx, user_name, user_id, user_pw) " +
			"values (user_seq.nextval, #{user_name}, #{user_id}, #{user_pw})")
	void addUserInfo(UserBean joinUserBean);

// 로그인 (아이디와 패스워드 일치할 경우 idx, name 조회)
	@Select("select user_idx, user_name " + 
			"from user_table " + 
			"where user_id=#{user_id} and user_pw=#{user_pw}")
	UserBean getLoginUserInfo(UserBean tempLoginUserBean);
	
// 로그인한 사람의 정보 가져와서 "정보수정" 페이지에서 활용	
	@Select("select user_id, user_name " +
			"from user_table " +
			"where user_idx = #{user_idx}")
	UserBean getModifyUserInfo(int user_idx);
	
// id 일치하는 것 찾아 비번 변경	
	@Update("update user_table " +
			"set user_pw = #{user_pw} " +
			"where user_idx = #{user_idx}")
	void modifyUserInfo(UserBean modifyUserBean);
}
