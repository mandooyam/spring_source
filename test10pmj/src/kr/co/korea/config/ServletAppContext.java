package kr.co.korea.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.korea.mapper.TestMapper;

@Configuration
@EnableWebMvc
@ComponentScan("kr.co.korea.controller")
@ComponentScan("kr.co.korea.dao")
@ComponentScan("kr.co.korea.service")
@PropertySource("/WEB-INF/properties/db.properties")
public class ServletAppContext implements WebMvcConfigurer{

	@Value("${db.classname}")
	private String db_classname;

	@Value("${db.url}")
	private String db_url;

	@Value("${db.username}")
	private String db_username;

	@Value("${db.password}")
	private String db_password;
	
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
	
	// 데이터베이스 접속 정보 관리 (org.apache.commons.dbcp2.BasicDataSource)
		@Bean
		public BasicDataSource dataSource() {
			BasicDataSource source = new BasicDataSource();
			source.setDriverClassName(db_classname);
			source.setUrl(db_url);
			source.setUsername(db_username);
			source.setPassword(db_password);
			 System.out.println("db connect");
			return source;
		}
	
		// 쿼리문과 접속 관리하는 객체
		@Bean
		public SqlSessionFactory factory(BasicDataSource source) throws Exception {
			SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
			factoryBean.setDataSource(source);
			SqlSessionFactory factory = factoryBean.getObject();
			 System.out.println("sql");
			return factory;
		}
		
		// 쿼리문 실행을 위한 객체
		@Bean
		public MapperFactoryBean<TestMapper> getTestMapper(SqlSessionFactory factory) throws Exception {
			MapperFactoryBean<TestMapper> factoryBean = new MapperFactoryBean<TestMapper>(TestMapper.class);
			factoryBean.setSqlSessionFactory(factory);
			return factoryBean;
		}
}
