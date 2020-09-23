package kr.co.korea.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import kr.co.korea.beans.DataBean1;
import kr.co.korea.beans.DataBean2;

@Configuration
public class RootAppContext {

	@Bean
	@RequestScope
	public DataBean1 dataBean1() {
		return new DataBean1();
	}
	
	@Bean("testBean2")
	@RequestScope
	public DataBean2 dataBean2() {
		return new DataBean2();
	}
}
