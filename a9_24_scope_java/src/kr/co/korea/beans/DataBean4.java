package kr.co.korea.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component(value="testBean4")
@RequestScope
public class DataBean4 {

	private String no;
	private String jumsu;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getJumsu() {
		return jumsu;
	}
	public void setJumsu(String jumsu) {
		this.jumsu = jumsu;
	}

}
