drop table board_info_table;
drop table user_table;
drop table content_table;

create sequence user_seq
start with 0
increment by 1
minvalue 0;

create sequence content_seq
start with 0
increment by 1
minvalue 0;

create table board_info_table(
	board_info_idx number constraint BOARD_INFO_PK primary key,
	board_info_name varchar2(500) not null
);

insert into board_info_table(board_info_idx, board_info_name) values (1, '1자유게시판');
insert into board_info_table(board_info_idx, board_info_name) values (2, '2게시판');
insert into board_info_table(board_info_idx, board_info_name) values (3, '3게시판');
insert into board_info_table(board_info_idx, board_info_name) values (4, '4게시판');

commit;

create table user_table(
	user_idx number constraint USER_PK primary key,
	user_name varchar2(50) not null,
	user_id varchar2(100) not null,
	user_pw varchar2(100) not null
);

create table content_table(
	content_idx number constraint CONTENT_PK primary key,
	content_subject varchar2(500) not null,
	content_text long not null,
	content_file varchar2(500),
	content_writer_idx number not null
	                   constraint CONTENT_FK1 references user_table(user_idx),
	content_board_idx number not null
	                  constraint CONTENT_FK2 references board_info_table(board_info_idx),
	content_date date not null
);

select * from board_info_table;
select * from user_table;
select * from content_table;

select a1.content_idx, a1.content_subject, a2.user_name as content_writer_name,
   to_char(a1.content_date, 'YYYY-MM-DD') as content_date
   from content_table a1, user_table a2 
   where a1.content_writer_idx = a2.user_idx  and a1.content_board_idx = 1 
   order by a1.content_idx desc;
