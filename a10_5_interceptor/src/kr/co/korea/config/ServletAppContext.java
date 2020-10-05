package kr.co.korea.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.korea.interceptor.TestLoginInterceptor;
import kr.co.korea.interceptor.TestWriterInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan("kr.co.korea.controller")
@ComponentScan("kr.co.korea.exception")
public class ServletAppContext implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addInterceptors(registry);
		
		TestLoginInterceptor testLoginInterceptor = new TestLoginInterceptor();
		InterceptorRegistration reg1 = registry.addInterceptor(testLoginInterceptor);
		reg1.addPathPatterns("/user/modify", "/user/logout", "/board/*");
		reg1.excludePathPatterns("/board/main");
		// reg1.addPathPatterns("/**");
		
		TestWriterInterceptor testWriterInterceptor = new TestWriterInterceptor();
		InterceptorRegistration reg2 = registry.addInterceptor(testWriterInterceptor);
		reg2.addPathPatterns("/board/modify", "/board/delete");
		// board/modify 수행시 2회 수행됨. reg1에 "board/*" 등록되어 있음
	}
	
}
