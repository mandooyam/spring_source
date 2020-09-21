drop table memtable;
create table memtable(
	id varchar2(100),
	name varchar2(100),
	pw varchar2(100)
);
select * from memtable;
insert into memtable (id, name, pw) 
values('1001', '홍길동', 'hong');