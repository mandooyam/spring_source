package kr.co.korea.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.korea.beans.DataBean;

@RestController
public class TestController3 {
	// (1)
	@GetMapping("/test3")
	public String test3() {
		return "test3";
	}

	// (2) 자바의 객체나 리스트 등을 JSON 문서로 구성하여 값 자체를 브라우저로 전달
	// (2) pom.xml 에서 jackson-databind 라이브러리 이용하여 데이터 전달가능
	@GetMapping("/test4")
	public ResponseEntity<ArrayList<DataBean>> test4() {
		DataBean bean1 = new DataBean("111", "111", "홍길동");
		DataBean bean2 = new DataBean("222", "222", "이기자");
		DataBean bean3 = new DataBean("333", "333", "최고야");
		ArrayList<DataBean> list = new ArrayList<DataBean>();
		list.add(bean1);
		list.add(bean2);
		list.add(bean3);
		ResponseEntity<ArrayList<DataBean>> entry = new ResponseEntity<ArrayList<DataBean>>(list, HttpStatus.OK);
		return entry;
	}

}
