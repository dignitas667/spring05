CREATE SEQUENCE autocomplete_no_seq;

CREATE TABLE t_autocomplete
(
	no number primary key,
	id varchar2(30) NOT NULL UNIQUE,
	label varchar2(300) NOT NULL,
	value varchar2(600) NOT NULL
);

insert into t_autocomplete(no, id, label, value)
values(autocomplete_no_seq.nextval, 'mysql','mysql은 가벼운 dbms입니다.','mysql은 oracle coperation');
insert into t_autocomplete(no, id, label, value)
values(autocomplete_no_seq.nextval, 'oracle','oracle은 기업용 dbms입니다.','oracle은 oracle coperation');
insert into t_autocomplete(no, id, label, value)
values(autocomplete_no_seq.nextval, 'sqlite','sqlite은 모바일용 dbms입니다.','sqlite은 대부분 모바일 제품에서 사용해요');
insert into t_autocomplete(no, id, label, value)
values(autocomplete_no_seq.nextval, 'confirm','이것은 확인용','확인');
insert into t_autocomplete(no, id, label, value)
values(autocomplete_no_seq.nextval, 'java','java는 가장 널리 사용하는 언어','java는 오라클 것');
insert into t_autocomplete(no, id, label, value)
values(autocomplete_no_seq.nextval, 'java web','java web은 안정성이 높음','java web은 안정성이 높아요');
insert into t_autocomplete(no, id, label, value)
values(autocomplete_no_seq.nextval, 'hyundai it&e','hyundai it&e','hyundai it&e');
insert into t_autocomplete(no, id, label, value)
values(autocomplete_no_seq.nextval, 'abbdule jaba','abbdul jaba는 최고의 센터','abbdul jaba는 앞에 둘이 막아도 여유있게 자봐~ 하고 훅샷을 던졌던 전설적인 센터');

commit;

