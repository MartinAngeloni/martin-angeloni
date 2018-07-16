use high_school;

SELECT c.name, t.last_name, t.first_name, s.first_name, s.last_name FROM course c
INNER JOIN teacher t on c.asigned_teacher = t.teacher_id INNER JOIN assist a on c.course_id = a.course_id INNER JOIN student s
WHERE c.course_id=1