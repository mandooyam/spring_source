package kr.co.korea.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.korea.beans.TestBean;
import kr.co.korea.mapper.TestMapper;

@Repository
public class TestDao {
	
	@Autowired
	private TestMapper testMapper;
	
	public void addMemberInfo(TestBean joinMemberBean) {
		testMapper.addMemberInfo(joinMemberBean);
	}
	
	public void removeMemberInfo(TestBean delMemberBean) {
		testMapper.removeMemberInfo(delMemberBean);
	}

}
