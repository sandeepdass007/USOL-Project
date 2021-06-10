select * from student_academic_detail;	
-- desc student_academic_detail;
insert into student_academic_detail values('801','MScMathHS','1010',1,'2019-01-01','Res3');
insert into student_academic_detail values('802','BECSE','1011',1,'2013-01-01','Res3');
insert into student_academic_detail values('803','BAEngHS','1012',1,'2018-01-01','Res3');
insert into student_academic_detail values('804','MScMathHS','1010',1,'2019-07-01','Res1');
insert into student_academic_detail values('805','BECSE','1011',1,'2013-07-01','Res3');
insert into student_academic_detail values('806','BAEngHS','1012',1,'2018-07-01','Res1');


-- step 2 (Entering semester level result for CSE Sem 2 and reappear of CSE Sem1) 

insert into student_academic_detail values('807','BECSE','1011',1,'2014-01-01','Res1');
insert into student_academic_detail values('808','BECSE','1011',2,'2013-01-07','Res1');



-- step 3 (Entering semester level result for CSE Sem 3-8)
insert into student_academic_detail values('810','BECSE','1011',3,'2014-01-01','Res1');
insert into student_academic_detail values('811','BECSE','1011',4,'2014-07-01','Res1');
insert into student_academic_detail values('812','BECSE','1011',5,'2015-01-01','Res1');
insert into student_academic_detail values('813','BECSE','1011',6,'2015-01-07','Res1');
insert into student_academic_detail values('814','BECSE','1011',7,'2016-01-01','Res1');
insert into student_academic_detail values('815','BECSE','1011',8,'2016-07-01','Res1');


-- step 4 (Entering semester level results for PGDCA)
insert into student_academic_detail values('816','PGDCA','1013',1,'2021-01-01','Res1');
insert into student_academic_detail values('817','PGDCA','1013',2,'2021-07-01','Res1');


