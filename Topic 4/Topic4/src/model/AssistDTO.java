package model;

/**
 * Created by martin on 15/7/2018.
 */
public class AssistDTO {

    private Integer id;
    private StudentDTO studentId;
    private CourseDTO courseId;
    private Integer partial1;
    private Integer partial2;
    private Integer partial3;
    private Integer final_note;


    public AssistDTO(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StudentDTO getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentDTO studentId) {
        this.studentId = studentId;
    }

    public CourseDTO getCourseId() {
        return courseId;
    }

    public void setCourseId(CourseDTO courseId) {
        this.courseId = courseId;
    }

    public Integer getPartial1() {
        return partial1;
    }

    public void setPartial1(Integer partial1) {
        this.partial1 = partial1;
    }

    public Integer getPartial2() {
        return partial2;
    }

    public void setPartial2(Integer partial2) {
        this.partial2 = partial2;
    }

    public Integer getPartial3() {
        return partial3;
    }

    public void setPartial3(Integer partial3) {
        this.partial3 = partial3;
    }

    public Integer getFinal_note() {
        return final_note;
    }

    public void setFinal_note(Integer final_note) {
        this.final_note = final_note;
    }

    @Override
    public String toString() {
        return studentId.getLastName()+", "+studentId.getFirstName()+"\n";
    }
}
