select * from course_info;
DESC COURSE_INFO;
insert into course_info values ('MscMathHS', 'MSc Mathematics (H.S)', 'CrsTyp2', 4, 2);
insert into course_info values ('BECSE','Bachelor of Engineering (Computer Science)', 'CrsTyp1', 8, 4);
insert into course_info values ('BAEngHS', 'Bachelor of Arts (English Hons)', 'CrsTyp1', 6, 3);



-- step 3 (New course being added)
insert into course_info values ('PGDCA', 'Post Graduate Diploma in Computer Applications' , 'CrsTyp4', 2, 1);


-- step 5 (Adding new courses for homepage visuals)
insert into course_info values ('LLB', 'Bachelor of Legislative Law' , 'CrsTyp1', 6, 3);
insert into course_info values ('MBBS' , 'Bachelor of Medicine and a Bachelor of Surgery', 'CrsTyp1', 10,5);
insert into course_info values ('PhD(Urdu)', 'Doctor of Philosophy (Urdu)', 'CrsTyp3', 14, 7);
insert into course_info values ('CC(French)', 'Certificate Course in French', 'CrsTyp5', 2,1);
insert into course_info values('BCA', 'Bachelor of Computer Applications', 'CrsTyp1', 6, 3);