-- select * from student_detail;
-- delete from student_detail where enrollment_no = '12345';
insert into student_detail values ('1010', '98765', 'CD001', 'MScMathHS', 2 ,'1997-01-01', "meharkthind@gmail.com",'Mehar','Thind','Kaur','Par001','53692', "2020-05-31", "2018-07-01", 'Stutyp1', "15-MATH-15");
insert into student_detail values ('1011', '65432', 'CD002', 'BECSE', 8, '1994-04-29', "sandeepdass003@gmail.com", 'Sandeep', 'Dass', null, 'Par002', '53791', "2016-05-31", "2012-07-01",'Stutyp1', "12-CET-103");
insert into student_detail values ('1012', '54321', 'CD003', 'BAEngHS', 2, '1998-09-21', "ns0059726@gmail.com", 'Naina', null, null, 'Par003', '53676', "2020-05-31", "2017-07-01", 'Stutyp1', "18117000512");

-- desc student_detail;

-- step 3 (getting enrolled in a new course)
insert into student_detail values ('1013', '87654', 'CD002', 'PGDCA', 2, '1994-04-29', "sandeepdass003@gmail.com", 'Sandeep', 'Dass', null, 'Par002', '45612' , "2021-05-31", "2020-07-01", 'Stutyp3', "12-CET-103");


-- step 4 (Adding dummy student data to Course PGDCA and CSE)
Insert into student_detail values ('1014', '78945', 'CD004', 'BECSE', 8, "1994-07-16", "abc1@gmail.com", "Niharika", "Goyal", null, 'Par003', '53792', "2016-05-31", "2012-07-01",'Stutyp1', "12-CET-104");
insert into student_detail values ('1015', '45698', 'CD005', 'BECSE', 8, "1994-12-06", "def2@gmail.com", "Pratyush", null, null, 'Par003', '53793', "2016-05-31", "2012-07-01",'Stutyp1', "12-CET-105");
insert into student_detail values ('1016', '32145', 'CD006', 'BECSE', 8, "1994-03-30", "ghi3@gmail.com", "Mohit", "Goyal", null, 'Par003', '53794', "2016-05-31", "2012-07-01",'Stutyp1', "12-CET-106");
insert into student_detail values ('1017', '78931', 'CD007', 'BECSE', 8, "1994-06-19", "jkl4@gmail.com", "Kanika", null, null, 'Par003', '53795', "2016-05-31", "2012-07-01",'Stutyp1', "12-CET-107");

Insert into student_detail values ('1018', '74569', 'CD004', 'PGDCA', 2, "1994-07-16", "abc1@gmail.com", "Niharika", "Goyal", null, 'Par003', '45613', "2021-05-31", "2020-07-01", 'Stutyp3', "12-CET-104"); 
insert into student_detail values ('1019', '45633', 'CD005', 'PGDCA', 2, "1994-12-06", "def2@gmail.com", "Pratyush", null, null, 'Par003', '45614', "2021-05-31", "2020-07-01", 'Stutyp3', "12-CET-105");
insert into student_detail values ('1020', '32111', 'CD006', 'PGDCA', 2, "1994-03-30", "ghi3@gmail.com", "Mohit", "Goyal", null, 'Par003', '45615', "2021-05-31", "2020-07-01", 'Stutyp3', "12-CET-106");
insert into student_detail values ('1021', '78984', 'CD007', 'PGDCA', 2, "1994-06-19", "jkl4@gmail.com", "Kanika", null, null, 'Par003', '45616', "2021-05-31", "2020-07-01", 'Stutyp3', "12-CET-107");

-- step 5 (Adding dummy students only in student_detail table for producing variation on pie chart and year wise course type enrollment chart)
 insert into student_detail values('1022','78542','CD008','LLB',2,'1995-03-30','xyz2@gmail.com','Ujwal','Anand',null,'Par005','14785','2018-05-31','2015-07-01','StuTyp1','15-ABC-18');
insert into student_detail values('1023','45982','CD009','MScMathHS',4,'1995-03-31','mnb@gmail.com','Supriya','Taneja',null,'Par006','45987','2019-05-31','2017-07-01','StuTyp1','15-ABC-19');
insert into student_detail values('1024','16478','CD010','MBBS',3,'1995-04-01','qae8@gmail.com','Peehu','Kainth',null,'Par007','75632','2019-05-31','2014-07-01','StuTyp1','15-ABC-20');
insert into student_detail values('1025','89862','CD011','LLB',4,'1995-04-02','lpo8@gmail.com','Neha','Badhan',null,'Par008','45120','2016-05-31','2013-07-01','StuTyp1','15-ABC-21');
insert into student_detail values('1026','76321','CD012','LLB',1,'1995-04-03','uyt5@gmail.com','Ranjit','Khosla',null,'Par009','96300','2019-05-31','2016-01-07','StuTyp1','15-ABC-22');
insert into student_detail values('1027','79862','CD013','LLB',3,'1995-04-04','aqw3@gmail.com','Pranjal','Verma',null,'Par010','78410','2019-05-31','2016-01-07','StuTyp1','15-ABC-23');
insert into student_detail values('1028','46336','CD014','MBBS',2,'1995-04-05','34t5@gmail.com','Sourabh','Sharma',null,'Par006','12596','2018-05-31','2013-01-07','StuTyp1','15-ABC-24');
insert into student_detail values('1029','12008','CD015','MBBS',2,'1995-04-06','789@gmail.com','Rishabh','Sagar',null,'Par007','30147','2018-05-31','2013-01-07','StuTyp1','15-ABC-25');
insert into student_detail values('1030','78646','CD016','MBBS',4,'1995-04-07','254pl@gmail.com','Mehak','Salot',null,'Par005','15896','2018-05-31','2013-01-07','StuTyp1','15-ABC-26');
insert into student_detail values('1031','65165','CD017','PhD(Urdu)',3,'1995-04-08','mpol09@gmail.com','Vishal','Nagpal',null,'Par006','44182','2022-05-31','2015-07-01','StuTyp1','15-ABC-27');
insert into student_detail values('1032','20314','CD018','PhD(Urdu)',1,'1995-04-09','123s@gmail.com','Meenakshi','Mahajan',null,'Par007','25698','2022-05-31','2015-07-01','StuTyp1','15-ABC-28');
insert into student_detail values('1033','76541','CD019','PhD(Urdu)',5,'1995-04-10','bhy@gmail.com','Vipul','Gupta',null,'Par008','47863','2022-05-31','2015-07-01','StuTyp1','15-ABC-29');
insert into student_detail values('1034','25463','CD020','PhD(Urdu)',5,'1995-04-11','vrt5@gmail.com','Sarita','Singla',null,'Par005','24986','2022-05-31','2015-07-01','StuTyp1','15-ABC-30');
insert into student_detail values('1035','87562','CD021','PhD(Urdu)',3,'1995-04-12','mkp@gmail.com','Rita','Saib',null,'Par006','79893','2024-05-31','2017-07-01','StuTyp1','15-ABC-31');
insert into student_detail values('1036','41236','CD022','PhD(Urdu)',2,'1995-04-13','9909g@gmail.com','Nitika','Zahoor',null,'Par007','56213','2024-05-31','2017-07-01','StuTyp1','15-ABC-32');
insert into student_detail values('1037','54639','CD023','CC(French)',1,'1995-04-14','mnj7@gmail.com','Pooja','Dahiya',null,'Par008','78546','2021-05-31','2020-07-01','StuTyp1','15-ABC-33');
insert into student_detail values('1038','78963','CD024','CC(French)',2,'1995-04-15','wer2@gmail.com','Parul','Saini',null,'Par007','23030','2021-05-31','2020-07-01','StuTyp1','15-ABC-34');
insert into student_detail values('1039','41200','CD025','BCA',3,'1995-04-16','hyuyu@gmail.com','Inaya','Garg',null,'Par008','3012','2022-05-31','2019-07-01','StuTyp1','15-ABC-35');
insert into student_detail values('1040','78632','CD026','BCA',4,'1995-04-17','plo9@gmail.com','Pragya','Thakur',null,'Par009','78462','2022-05-31','2019-07-01','StuTyp1','15-ABC-36');
insert into student_detail values('1041','45682','CD027','BCA',6,'1995-04-18','tgf5@gmail.com','Meraj','Rana',null,'Par010','78423','2022-05-31','2019-07-01','StuTyp1','15-ABC-37');
insert into student_detail values('1042','47741','CD028','MScMathHS',3,'1995-04-19','123p@gmail.com','Krishna','Jaiswal',null,'Par006','36970','2020-05-31','2018-07-01','StuTyp1','15-ABC-38');
insert into student_detail values('1043','12365','CD029','BAEngHS',4,'1995-04-20','kjl2@gmail.com','Shehnaz','Bala',null,'Par007','15248','2015-05-31','2012-07-01','StuTyp1','15-ABC-39');
insert into student_detail values('1044','96852','CD030','BAEngHS',5,'1995-04-21','swq2@gmail.com','Shashi','Mengi',null,'Par005','12036','2015-05-31','2012-07-01','StuTyp1','15-ABC-40');
insert into student_detail values('1045','78963','CD031','BAEngHS',3,'1995-04-22','lpo2@gmail.com','Anuradha','Hassan',null,'Par009','12036','2015-05-31','2012-07-01','StuTyp1','15-ABC-41');
insert into student_detail values('1046','41300','CD032','BCA',2,'1995-04-23','p0l2@gmail.com','Ritika','Gill',null,'Par010','74852','2017-05-31','2014-07-01','StuTyp1','15-ABC-42');
insert into student_detail values('1047','78523','CD033','BCA',3,'1995-04-24','czx@gmail.com','Priya','Dhillon',null,'Par006','12036','2017-05-31','2014-07-01','StuTyp1','15-ABC-43');
insert into student_detail values('1048','96325','CD034','BCA',5,'1995-04-25','jun9@gmail.com','Simran','Virk',null,'Par006','45890','2017-05-31','2014-07-01','StuTyp1','15-ABC-44');
insert into student_detail values('1049','78452','CD035','CC(French)',2,'1995-04-26','96pl@gmail.com','Supreet','Mann',null,'Par007','74890','2020-05-31','2019-07-01','StuTyp1','15-ABC-45');
insert into student_detail values('1050','73333','CD036','MBBS',1,'1995-04-27','mopq@gmail.com','Seerat','Sidhu',null,'Par005','14587','2023-05-31','2016-07-01','StuTyp1','15-ABC-46');
