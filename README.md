# MyBlog
用Maven/spring/springMVC/MyBatis搭建博客系统

数据库表设计
------------------
-- user 用户表
------------------
名称	字段名	类型	约束	说明
用户ID	user_id	mediumint(8)	NOTNULL AUTO_INCREMENT PRIMARY KEY	
用户组ID	group_id	mediumint(8)	NOTNULL	
用户名	user_name	varchar(32)	NOTNULL	
用户密码	user_pwd	varchar(32)	NOTNULL	
用户手机号码	user_phone	int（12）		
用户性别	user_sex	varchar(6)		
用户QQ号码	user_qq	mediumint(9)		
用户EMAIL	user_email	varchar(64)		
用户地址	user_address	varchar(255)		
用户生日	user_birthday	datetime		
人生格言	user_motto	varchar(255)		
用户头像存储路径	user_image_url	varchar(255)		
用户注册时间	user_register_time	datetime		
用户注册时IP地址	user_register_ip	varchar(15)		
用户微博	user_weibo	varchar(255)		
用户血型	user_blood_type	char(3)		
是否锁定	user_lock	tinyint(3)		0为不锁定，1为锁定
是否冻结	user_freeze	tinyint(3)		
拥有权限	user_power	varchar(255)		

------------------
-- power_list 功能权限表
------------------
名称	字段名	类型	约束	说明
自增ID	p_id	mediumint(8)	NOTNULL AUTO_INCREMENT
PRIMARY KEY	
权限ID	power_id	mediumint(8)		
权限名称	power_name	varchar(36)		

-------------------
--friend 好友表 
-------------------

名称	字段名	类型	约束	说明
自增ID	f_id	smallint(5)	NOTNULL AUTO_INCREMENT
PRIMARY KEY	
用户ID	user_id	mediumint(8)		
好友ID	friend_id	mediumint(8)		

--------------------
-- message 用户留言表
--------------------
名称	字段名	类型	约束	说明
留言表自增ID	message _id	smallint(5)	NOTNULL AUTO_INCREMENT
PRIMARY KEY	
用户ID	user_id	mediumint(8)		
留言者ID	message _user_id	mediumint(8)		
留言内容	message_content	text		
留言时间	message_stay_time	datetime		
留言用户的IP地址	message _user_ip	varchar(15)		

----------------------------
--article 文章表
----------------------------

名称	字段名	类型	约束	说明
日志自增ID	article_id	smallint(5)	NOTNULL AUTO_INCREMENT
PRIMARY KEY	
文章名称	article_name	varchar(128)		
发布时间	article_time	datetime		
发布IP	article_ip	varchar(15)		
查看人数	article_click	int(10)		
所属分类	sort_article_id	mediumint(8)		
所属用户ID	user_id	mediumint(8)		
栏目ID	type_id	tinyint(3)	DEFAULT 1	默认为1
文章的模式	article_type	tinyint(3)		0为私有，1为公开，2为仅好友查看
文章内容	article_content	text		
置顶	article_up	tinyint(3)		0为否，1为是
博主推荐	article_support	tinyint(3)		0为否，1为是

---------------------------
--article_sort 文章分类表
---------------------------
名称	字段名	类型	约束	说明
文章分类自增ID	sort_article_id	mediumint(8)	NOTNULL AUTO_INCREMENT
PRIMARY KEY	
分类名称	sort_article_name	varchar(60)		

----------------------------
--user_comment 用户评论表
----------------------------
名称	字段名	类型	约束	说明
评论自增ID	c_id	mediumint(8)	NOTNULL AUTO_INCREMENT
PRIMARY KEY	
收到评论的用户ID	user_id	mediumint(8)		
评论栏目ID
	type_id	tinyint(3)
		
评论内容的ID	commit_id	mediumint(8)		
评论内容	commit_content	varchar(255)		
评论者ID	commit_user_id	mediumint(8)		
评论时间	commit_time	datetime		
评论时的IP地址	commit_ip	varchar(15)		

-------------------------
-- dynamic 用户心情动态表
-------------------------
名称	字段名	类型	约束	说明
动态记录ID	dynamic _id	mediumint(8)	NOTNULL AUTO_INCREMENT
PRIMARY KEY	
用户ID	user_id	mediumint(8)		
发布时间	dynamic _time	datetime		
动态发布时的IP地址	dynamic _ip	varchar(15)		
动态内容	dynamic_content	text		
栏目ID	type_id	tinyint(3)	DEFAULT 2	默认为2
