package model;

import utils.DBUtils;
import utils.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 15/7/2018.
 */
public class DAO {

    public static CourseDTO getCourseTeachersAndStudents(MySQLConnection mySQLConnection, String courseName){
        String query = String.format("SELECT c.name, t.last_name as teacher_last_name, t.first_name as teacher_name, s.first_name, s.last_name \n" +
                "FROM course c\n" +
                "INNER JOIN teacher t on c.asigned_teacher = t.teacher_id \n" +
                "INNER JOIN assist a on c.course_id = a.course_id \n" +
                "INNER JOIN student s on a.student_id = s.registration_id\n" +
                "WHERE c.name = '%s' \n" +
                "ORDER BY s.last_name ASC", courseName) ;

        ResultSet result = DBUtils.executeQuery(mySQLConnection, query);

        CourseDTO course = new CourseDTO();
        course.setName(courseName);
        List<AssistDTO> assists = new ArrayList<AssistDTO>();
        course.setAssists(assists);
        TeacherDTO teacher = new TeacherDTO();
        course.setAsignedTeacher(teacher);

        try {
            while(result.next()){
                if(teacher.getName() == null){
                    teacher.setLastName(result.getString("teacher_last_name"));
                    teacher.setName(result.getString("teacher_name"));
                }

                StudentDTO studentDTO = new StudentDTO();
                studentDTO.setFirstName(result.getString("first_name"));
                studentDTO.setLastName(result.getString("last_name"));
                AssistDTO assistDTO = new AssistDTO();
                assistDTO.setStudentId(studentDTO);
                assistDTO.setCourseId(course);
                course.getAssists().add(assistDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return course;
    }

    public static String getPercentOfStudentApprovedAGivenCourse(MySQLConnection mySQLConnection){

        String query = "select (select count(*) from course c\n" +
                "inner join assist a on c.course_id = a.course_id\n" +
                "where a.final_note >=60 and c.course_id=1) /(select count(*) from course c\n" +
                "inner join assist a on c.course_id = a.course_id where c.course_id=1) * 100";

        ResultSet result = DBUtils.executeQuery(mySQLConnection, query);
        String percent="";
        try {
            result.next();
            percent = result.getString(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Students approved: %" + percent;
    }

    public static String getPercentOfStudentNotApprovedAGivenCourse(MySQLConnection mySQLConnection){

        String query = "select (select count(*) from course c\n" +
                "inner join assist a on c.course_id = a.course_id\n" +
                "where a.final_note <60 and c.course_id=1) /(select count(*) from course c\n" +
                "inner join assist a on c.course_id = a.course_id where c.course_id=1) * 100";

        ResultSet result = DBUtils.executeQuery(mySQLConnection, query);
        String percent="";
        try {
            result.next();
            percent = result.getString(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Students not approved: %" + percent;
    }

    public static String timeLineOfEachCourseOfAGivenTeacher(MySQLConnection mySQLConnection, String teacherName){

        String query = String.format("SELECT t.last_name, t.first_name, c.schedule_time, c.name FROM teacher t\n" +
                "INNER JOIN course c on c.asigned_teacher = t.teacher_id\n" +
                "where t.last_name = '%s'\n" +
                "order by c.schedule_time", teacherName);

        ResultSet result = DBUtils.executeQuery(mySQLConnection, query);
        String teacherFirstName = "";
        String teacherLastName = "";
        String scheduleTime = "";
        String course = "";

        try {
            while(result.next()){
                teacherFirstName = result.getString("t.first_name");
                teacherLastName = result.getString("t.last_name");
                scheduleTime = result.getString("c.schedule_time");
                course = result.getString("c.name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Teacher: "+teacherLastName+", "+teacherFirstName+"\n" +
                "Schedule:\n" +
                scheduleTime+": "+course;
    }

}
