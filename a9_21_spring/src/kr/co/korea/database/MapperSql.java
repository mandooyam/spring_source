package kr.co.korea.database;

import org.apache.ibatis.annotations.Insert;

import kr.co.korea.beans.DataBean;

public interface MapperSql {
	
	@Insert("insert into memtable (id, name, pw)  values(#{id}, #{name}, #{pw})")
	void insert_data(DataBean dataBean);
}
