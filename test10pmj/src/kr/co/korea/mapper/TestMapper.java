package kr.co.korea.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

import kr.co.korea.beans.TestBean;

public interface TestMapper {

	@Insert("insert into member (code, name, id, pwd, age) "
			+ "values (#{code}, #{name}, #{id}, #{pwd}, #{age})")
	void addMemberInfo(TestBean joinMemberBean);
	
	@Delete("delete from member where id=#{id}")
	void removeMemberInfo(TestBean delMemberBean);
}
