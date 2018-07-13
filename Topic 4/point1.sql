use high_school;
create table student (
registration_id int primary key not null unique,
first_name varchar(20),
last_name varchar(20),
birthday date); 

create table teacher (
teacher_id int primary key not null unique,
first_name varchar(20),
last_name varchar(20),
birthday date);

create table course (
course_id int primary key not null unique,
name varchar(20),
asigned_teacher int,
hours_by_week int,
schedule_time int);

create table assist (
id int primary key not null,
student_id int not null unique,
course_id int not null unique,
partial1 int,
partial2 int,
partial3 int,
final_note int);

alter table course
add constraint fk_course_assist foreign key (course_id) references assist (course_id);

alter table student
add constraint fk_student_assist foreign key (registration_id) references assist (student_id);

alter table course
add constraint fk_teachar_course foreign key (asigned_teacher) references teacher (teacher_id);
