package kr.co.korea.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class DataBean1 {

	@Size(min=2, max=10)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String id;
	
	@Size(min=2, max=10)
	@Pattern(regexp = "[가-힣]*")
	private String name;
	
	@Max(100)
	private String kor;
	
	@Max(100)
	private String eng;
	
	@NotNull
	private String level;
	
	@Email
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
