package model;

import java.util.List;

/**
 * Created by martin on 15/7/2018.
 */
public class CourseDTO {

    private Integer courseId;
    private String name;
    private TeacherDTO asignedTeacher;
    private Integer hoursByWeek;
    private Integer scheduleTime;
    private List<AssistDTO> assists;

    public CourseDTO(){

    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeacherDTO getAsignedTeacher() {
        return asignedTeacher;
    }

    public void setAsignedTeacher(TeacherDTO asignedTeacher) {
        this.asignedTeacher = asignedTeacher;
    }

    public int getHoursByWeek() {
        return hoursByWeek;
    }

    public void setHoursByWeek(int hoursByWeek) {
        this.hoursByWeek = hoursByWeek;
    }

    public int getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(int scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public List<AssistDTO> getAssists() {
        return assists;
    }

    public void setAssists(List<AssistDTO> assists) {
        this.assists = assists;
    }

    public void printTeacherAndStudents(){
        System.out.println("Course: "+ name +"\n"
                +"Teacher: "+asignedTeacher.getLastName()+", "+asignedTeacher.getName()+"\n"+
                "Students:\n");
        for (AssistDTO a: assists) {
            System.out.println(a.getStudentId().getLastName()+", "+a.getStudentId().getFirstName());
        }

    }
}
