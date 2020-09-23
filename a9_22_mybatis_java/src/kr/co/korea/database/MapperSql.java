package kr.co.korea.database;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.korea.beans.DataBean;

public interface MapperSql {
	
	@Insert("insert into memtable(id, name, pw) values(#{id}, #{name}, #{pw})")
	void insert_data(DataBean dataBean);		// 컨트롤러에서 insert_data(dataBean) 이름으로 호출되는 메소드
	
	@Select("select * from memtable") // 컨트롤러에서 select_data() 이름으로 호출되는 메소드
	List<DataBean> select_data();
	
	@Select("select count(*) from memtable")
	int select_one();
	
	@Update("update memtable set pw=#{pw} where id=#{id}")
	int update_data(DataBean dataBean);
	
	@Delete("delete from memtable where id=#{id} and pw=#{pw}")
	int delete_data(DataBean dataBean);
	
}
