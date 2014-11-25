create database npe_project; /*스키마만들기....*/

/* 아래 두줄을 반드시 먼저 실행*/
use npe_project; /* 스키마를 사용하겠다는뜻 */
SET SQL_SAFE_UPDATES=0; /* mysql에서는 update사용할때 이렇게 풀어줘야한다.*/

/*MySQL은 Sequence가 없어 auto_increment로..........*/
create table tbl_keyword (
	mno int auto_increment primary key,
	username varchar(50),
	score int,
	regdate datetime default now(),
	keyword varchar(200)
 ); 
 
 create table tbl_score (
	sno int auto_increment primary key,
	keyword varchar(200),
	score int
 );
 
 commit;
 
 /* auto_increment 초기화......
 alter table tbl_keyword auto_increment=1;
 */
 drop table npe_project.tbl_keyword;
 drop table npe_project.tbl_score;
 
/* 여기 두 문장은 auto_increment 를 하려면 어렵다.......
 alter table tbl_keyword add primary key (mno);
 alter table tbl_score add primary key (sno);
 */
 
 select sysdate();
 select now();
 /*찾아 보면 now()를 사용하는게 좋다고 하는데 다시 찾아보기...*/
 
/*-----------------------------------------------
--기분 점수
*/
truncate table tbl_score;

insert into tbl_score (keyword, score)
values ('기쁨',90);

insert into tbl_score (keyword, score)
values ('좋은',80);

insert into tbl_score (keyword, score)
values ('슬픈',30);

insert into tbl_score (keyword, score)
values ('나쁜',40);

insert into tbl_score (keyword, score)
values ('ㅠㅠ',50);

insert into tbl_score (keyword, score)
values ('ㅋㅋ',60);

select * from npe_project.tbl_score;

commit;
/***************************************************************************/
/* 11 월 21일...............................더미 데이터....................*/

truncate tbl_score;
select * from npe_project.tbl_score;


insert into tbl_score (keyword, score)
values ('좋다',95);

insert into tbl_score (keyword, score)
values ('좋았다',96);

insert into tbl_score (keyword, score)
values ('좋구만',92);

insert into tbl_score (keyword, score)
values ('좋은',90);

insert into tbl_score (keyword, score)
values ('좋음',92);

insert into tbl_score (keyword, score)
values ('좋고',96);

insert into tbl_score (keyword, score)
values ('좋네',91);

insert into tbl_score (keyword, score)
values ('좋구나',92);

insert into tbl_score (keyword, score)
values ('좋으니',93);

insert into tbl_score (keyword, score)
values ('좋아서',94);

insert into tbl_score (keyword, score)
values ('좋으므로',97);

insert into tbl_score (keyword, score)
values ('기쁘다',86);

insert into tbl_score (keyword, score)
values ('기쁜',88);

insert into tbl_score (keyword, score)
values ('기쁨',89);

insert into tbl_score (keyword, score)
values ('기뻐서',82);

insert into tbl_score (keyword, score)
values ('기쁘고',87);

insert into tbl_score (keyword, score)
values ('기쁘네',84);

insert into tbl_score (keyword, score)
values ('기쁘구나',82);

insert into tbl_score (keyword, score)
values ('기쁘니',83);

insert into tbl_score (keyword, score)
values ('기뻤다',81);

insert into tbl_score (keyword, score)
values ('기쁘구만',89);

insert into tbl_score (keyword, score)
values ('신난다',86);

insert into tbl_score (keyword, score)
values ('신난',84);

insert into tbl_score (keyword, score)
values ('신남',78);

insert into tbl_score (keyword, score)
values ('신나서',76);

insert into tbl_score (keyword, score)
values ('신나고',79);

insert into tbl_score (keyword, score)
values ('신나네',74);

insert into tbl_score (keyword, score)
values ('신나는구나',72);

insert into tbl_score (keyword, score)
values ('신나니',71);

insert into tbl_score (keyword, score)
values ('신났다',74);

insert into tbl_score (keyword, score)
values ('신나는구만',78);

insert into tbl_score (keyword, score)
values ('즐겁다',89);

insert into tbl_score (keyword, score)
values ('즐거웠다',86);

insert into tbl_score (keyword, score)
values ('즐거운',87);

insert into tbl_score (keyword, score)
values ('즐거움',81);

insert into tbl_score (keyword, score)
values ('즐겁고',87);

insert into tbl_score (keyword, score)
values ('즐겁네',84);

insert into tbl_score (keyword, score)
values ('즐겁구나',88);

insert into tbl_score (keyword, score)
values ('즐거우니',84);

insert into tbl_score (keyword, score)
values ('즐거워서',83);

insert into tbl_score (keyword, score)
values ('즐거우므로',87);

insert into tbl_score (keyword, score)
values ('즐겁구만',86);

insert into tbl_score (keyword, score)
values ('행복하다',99);

insert into tbl_score (keyword, score)
values ('행복했다',87);

insert into tbl_score (keyword, score)
values ('행복한',84);

insert into tbl_score (keyword, score)
values ('행복함',87);

insert into tbl_score (keyword, score)
values ('행복',84);

insert into tbl_score (keyword, score)
values ('행복하네',82);

insert into tbl_score (keyword, score)
values ('행복하구나',87);

insert into tbl_score (keyword, score)
values ('행복하니',77);

insert into tbl_score (keyword, score)
values ('행복해서',76);

insert into tbl_score (keyword, score)
values ('행복하므로',97);

insert into tbl_score (keyword, score)
values ('행복하구만',86);

insert into tbl_score (keyword, score)
values ('흐뭇하다',96);

insert into tbl_score (keyword, score)
values ('흐뭇했다',94);

insert into tbl_score (keyword, score)
values ('흐뭇한',85);

insert into tbl_score (keyword, score)
values ('흐뭇함',87);

insert into tbl_score (keyword, score)
values ('흐뭇',81);

insert into tbl_score (keyword, score)
values ('흐뭇하네',82);

insert into tbl_score (keyword, score)
values ('흐뭇하구나',83);

insert into tbl_score (keyword, score)
values ('흐뭇하니',87);

insert into tbl_score (keyword, score)
values ('흐뭇해서',83);

insert into tbl_score (keyword, score)
values ('흐뭇하므로',81);

insert into tbl_score (keyword, score)
values ('흐뭇하구만',82);

insert into tbl_score (keyword, score)
values ('상쾌하다',86);

insert into tbl_score (keyword, score)
values ('상쾌했다',87);

insert into tbl_score (keyword, score)
values ('상쾌한',86);

insert into tbl_score (keyword, score)
values ('상쾌함',97);

insert into tbl_score (keyword, score)
values ('상쾌',86);

insert into tbl_score (keyword, score)
values ('상쾌하네',87);

insert into tbl_score (keyword, score)
values ('상쾌하구나',84);

insert into tbl_score (keyword, score)
values ('상쾌하니',86);

insert into tbl_score (keyword, score)
values ('상쾌해서',82);

insert into tbl_score (keyword, score)
values ('상쾌하므로',83);

insert into tbl_score (keyword, score)
values ('상쾌하구만',85);

commit;
/*------------------------------------------------*/

insert into tbl_msg(startno, endno, msg)
 values (0, 30, '기분이 정말 나쁘군요...0');
 
insert into tbl_msg(startno, endno, msg)
 values (10, 30, '기분이 조금 나쁘군요...10');
 
  insert into tbl_msg(startno, endno, msg)
 values (20, 30, '기분이 쬐금 않좋군요...20');
 
  insert into tbl_msg(startno, endno, msg)
 values (30, 60, '기분이 조금 않좋은 편이군요...30');
 
  insert into tbl_msg(startno, endno, msg)
 values (40, 60, '기분이 살짝 다운됬군요...40');
 
  insert into tbl_msg(startno, endno, msg)
 values (50, 60, '기분이 그저 그렇군요...50');
 
  insert into tbl_msg(startno, endno, msg)
 values (60, 90, '기분이 그럭저럭 괜찮군요...60');
 
  insert into tbl_msg(startno, endno, msg)
 values (70, 90, '기분이 좋은 편이군요...70');
 
  insert into tbl_msg(startno, endno, msg)
 values (80, 90, '기분이 정말 좋군요...80');
 
  insert into tbl_msg(startno, endno, msg)
 values (90, 100, '기분이 정말 날아갈거 같군요...90');
 
  insert into tbl_msg(startno, endno, msg)
 values (95, 100, '미친듯이 날뛰고 있군요...95');
 
  insert into tbl_msg(startno, endno, msg)
 values (80, 100, '기분이 업 되셨군요...80');
 
 insert into tbl_msg(startno, endno, msg)
 values (80, 100, '신나셨군요...80');
 
 insert into tbl_msg(startno, endno, msg)
 values (80, 100, '택배왔나요?...80');
 
 insert into tbl_msg(startno, endno, msg)
 values (80, 100, '여자친구 만나러 가나요?...80');
 
 insert into tbl_msg(startno, endno, msg)
 values (80, 100, '집에 부모님이 안계시나요?...80');

/*------------------------------------------------
--키워드*/
insert into npe_project.tbl_keyword(USERNAME, keyword)
values('user01', '좋은');

insert into npe_project.tbl_keyword(USERNAME, keyword)
values('user01', '슬픈');

insert into npe_project.tbl_keyword(USERNAME, keyword)
values('user01', 'ㅠㅠ');

insert into npe_project.tbl_keyword(USERNAME, keyword)
values('user01', '나쁜');

/*---------------------------------------------*/

select * from npe_project.tbl_keyword order by regdate desc;
select * from npe_project.tbl_score;

/******************************************/
/*keyword데이터 입력된 후 tbl_score와 join하여 tbl_keyword에 score 셋팅*/
update npe_project.tbl_keyword k INNER JOIN npe_project.tbl_score s
ON k.keyword = s.keyword
set k.score = s.score
where k.score IS NULL;

/*이 문장을 최초 한번은 실행해 주어야 update문 사용가능 safe update 해제*/
SET SQL_SAFE_UPDATES=0;
/*mysql에서 실행계획을 확인하려먼 sql문 맨 위에 explain키워드를 추가해줘야한다..........*/
/*****************************************/

select * from tbl_keyword order by regdate desc;

update tbl_keyword set score = null where mno = 3;

select date_sub(now(), interval 7 day);
/*tbl_keyword에서 기간별로 평균 점수 뽑아내기*/
explain
select 
	round(avg(score))
from 
	npe_project.tbl_keyword
where username = 'user03' and regdate > date_sub(now(), interval 7 day) 
group by username;

/* 랜덤 row 추출.....day1124*/
select keyword from tbl_score
ORDER BY RAND()
LIMIT 2;

/* 푸시 메시지 테이블 생성....*/
create table tbl_msg (
	msgno int auto_increment primary key,
	startno int,
    endno int,
	msg varchar(2000)
 ); 
 
 select * from tbl_msg;
 commit;
 
 DELETE FROM tbl_keyword WHERE score IS NULL;
 
 /* 평균점수에 해당하는 메시지 추출 쿼리.......*/
 select startno, endno, msg
 from tbl_msg
 where 85 > startno and 85 < endno
 ORDER BY RAND()
LIMIT 1;
 

 
 


