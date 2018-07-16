import model.CourseDTO;
import model.DAO;
import utils.MySQLConnection;

/**
 * This class use a JDBC Driver
 * Created by martin on 14/7/2018.
 * @author angelonimartin90@gmail.com
 */
public class Main {
    public static void main(String args[]){

        MySQLConnection mySQLConnection = new MySQLConnection();
        mySQLConnection.connect("jdbc:mysql://localhost:3306/high_school","root", "jackbauer24");

        //teachers and students of a given course
        CourseDTO courseDTO = DAO.getCourseTeachersAndStudents(mySQLConnection, "Math");

        //print teachers and students of a given course
        courseDTO.printTeacherAndStudents();

        //percent of student approved
        System.out.println(DAO.getPercentOfStudentApprovedAGivenCourse(mySQLConnection));

        //percent of student not approved
        System.out.println(DAO.getPercentOfStudentNotApprovedAGivenCourse(mySQLConnection));

        //schedule time of the course of a given teacher
        System.out.println(DAO.timeLineOfEachCourseOfAGivenTeacher(mySQLConnection, "William"));

        mySQLConnection.disconnect();
    }
}
