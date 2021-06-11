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