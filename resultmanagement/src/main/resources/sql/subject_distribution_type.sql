-- select * from subject_distribution_type;
desc subject_distribution_type;
insert into subject_distribution_type values ('Subtyp1', "Mid Term");
insert into subject_distribution_type values ('Subtyp2', "Final");
insert into subject_distribution_type values ('Subtyp3', "Practical");
insert into subject_distribution_type values ('Subtyp4', "Viva");
insert into subject_distribution_type values ('Subtyp5', "Assignment");

-- step - 3 (Adding Project as a new distribution type)
insert into subject_distribution_type values ('Subtyp6', "Project");