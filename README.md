## 个人社区

## 来源
bilibli

    https://www.bilibili.com/video/av65117012?p=4
    
##资料
[Spring 文档](https://spring.io/guides)  
[Bootstarp文档](https://v3.bootcss.com/getting-started)  
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/)  
[OkHttp](https://square.github.io/okhttp/)
[Thymeleaf](http://www.thymeleaf.org)

##工具
[Visual Paradigm](https://www.visual-paradigm.com)  
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)  
[Lombok](https://www.projectlombok.org/)  

##图片
![Image text](https://github.com/yhmdemo/community/blob/master/image/github%20api%E6%B5%81%E7%A8%8B.png)  

##脚本
```sql
create table USER
(
  ID INTEGER auto_increment primary key,
  ACCOUNT_ID VARCHAR(100),
  NAME VARCHAR(50),
  TOKEN CHAR(36),
  GMT_CREATE BIGINT,
  GMT_MODIFIED BIGINT
);
create table question
(
	id int auto_increment primary key,
	title varchar(50),
	description text,
	gmt_create bigint,
	gmt_modified bigint,
	creator int,
	comment_count int default 0,
	view_count int default 0,
	like_count int default 0,
	tag varchar(256)
);
``` 
```bash
mvn flyway:migrate
```



    