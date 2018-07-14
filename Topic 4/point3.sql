SELECT c.name, t.last_name, t.first_name, s.first_name, s.last_name FROM course c
INNER JOIN teacher t INNER JOIN assist a INNER JOIN student s
WHERE s.registration_id = a.student_id ORDER BY s.last_name ASC