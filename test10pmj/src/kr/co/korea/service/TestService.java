package kr.co.korea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.korea.beans.TestBean;
import kr.co.korea.dao.TestDao;

@Service
public class TestService {
	
	@Autowired
	private TestDao testDao;
	
	public void addMemberInfo(TestBean joinMemberBean) {
		testDao.addMemberInfo(joinMemberBean);
	}
	
	public void removeMemberInfo(TestBean delMemberBean) {
		testDao.removeMemberInfo(delMemberBean);
	}
	

}
