create table my_user
(
	id int auto_increment
		primary key,
	version int not null,
	createTime timestamp null,
	lastUpdateTime timestamp null,
	userName varchar(20) not null,
	nickName varchar(20) null,
	activeFlag tinyint(1) not null,
	userType varchar(20) not null,
	phone bigint not null,
	mail varchar(20) null,
	gender varchar(5) null,
	addr varchar(50) null,
	createTimeInt int not null,
	password varchar(50) not null,
	constraint my_user_phone_uindex
		unique (phone),
	constraint my_user_userName_uindex
		unique (userName)
)
comment '用户账号表';

create index my_user_createtime_index
	on my_user (createTime);

create index my_user_createtimeint_index
	on my_user (createTimeInt);

