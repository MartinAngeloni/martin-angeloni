
INSERT INTO high_school.student (registration_id,first_name,last_name,birthday) VALUES (1,"Upton","Acosta","01-12-19"),(2,"Abbot","Gill","10-12-17"),(3,"Jordan","Morris","02-03-18"),(4,"Judah","Drake","01-08-19"),(5,"Kareem","Schultz","03-12-18"),(6,"Michael","Benjamin","11-05-18"),(7,"Troy","Justice","09-01-17"),(8,"Byron","Bishop","10-01-17"),(9,"Cruz","Hyde","01-07-19"),(10,"Calvin","Collins","07-12-18");
INSERT INTO high_school.student (registration_id,first_name,last_name,birthday) VALUES (11,"Kennan","Moody","04-04-19"),(12,"Ivor","Serrano","09-04-17"),(13,"Jin","Ramsey","08-12-18"),(14,"Chandler","Miller","01-10-19"),(15,"Jerome","Mayo","04-12-19"),(16,"Lance","Warner","05-12-18"),(17,"Jesse","Pittman","01-12-19"),(18,"Justin","Hendrix","08-12-18"),(19,"Russell","Parks","12-12-17"),(20,"Rajah","Jefferson","02-12-19");
INSERT INTO high_school.student (registration_id,first_name,last_name,birthday) VALUES (21,"Zeus","Mathis","06-12-19"),(22,"Rashad","Ray","04-12-18"),(23,"Reuben","Weiss","09-12-17"),(24,"Theodore","Chandler","07-09-18"),(25,"Coby","Melendez","04-12-19"),(26,"Nissim","Wilson","04-12-18"),(27,"Vladimir","Savage","07-12-18"),(28,"Mufutau","Robbins","01-12-18"),(29,"Gregory","Pollard","12-12-18"),(30,"Declan","Mercado","05-12-18");

INSERT INTO high_school.course (name,asigned_teacher,hours_by_week,schedule_time) VALUES ("Math",1,7,8);
INSERT INTO high_school.course (name,asigned_teacher,hours_by_week,schedule_time) VALUES ("Geography",2,5,9);
INSERT INTO high_school.course (name,asigned_teacher,hours_by_week,schedule_time) VALUES ("Law",3,9,3);

INSERT INTO high_school.teacher (teacher_id,first_name,last_name,birthday) VALUES (1,"Dane","William","02-08-19");
INSERT INTO high_school.teacher (teacher_id,first_name,last_name,birthday) VALUES (2,"Keith","Henderson","13-07-17");
INSERT INTO high_school.teacher (teacher_id,first_name,last_name,birthday) VALUES (3,"Alfonso","Jimenez","7-01-17");

INSERT INTO high_school.assist (id,student_id,course_id,partial1,partial2,partial3,final_note) VALUES (1,1,1,60,50,90,66),(2,2,1,30,40,60,43),(3,3,1,10,10,70,30),(4,4,1,10,10,10,10),(5,5,1,20,30,20,23),(6,6,1,100,90,90,93),(7,7,1,60,60,70,63),(8,8,1,30,30,30,30),(9,9,1,10,70,70,50),(10,10,1,10,10,10,10);
INSERT INTO high_school.assist (id,student_id,course_id,partial1,partial2,partial3,final_note) VALUES (11,11,2,10,10,10,10),(12,12,2,100,60,60,73),(13,13,2,40,40,40,40),(14,14,2,60,60,60,60),(15,15,2,10,60,60,43),(16,16,2,80,80,40,66),(17,17,2,30,80,80,63),(18,18,2,100,100,100,100),(19,19,2,90,90,90,90),(20,20,2,70,70,70,70);
INSERT INTO high_school.assist (id,student_id,course_id,partial1,partial2,partial3,final_note) VALUES (21,21,3,20,20,20,20),(22,22,3,60,60,60,60),(23,23,3,80,60,70,70),(24,24,3,70,70,70,70),(25,25,3,100,100,100,100),(26,26,3,100,100,100,100),(27,27,3,10,10,10,10),(28,28,3,10,10,10,10),(29,29,3,10,20,30,20),(30,30,3,10,10,10,10);