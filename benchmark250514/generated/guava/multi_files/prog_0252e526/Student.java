import com.google.common.collect.LinkedHashMultimap;
import java.util.Set;

public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void enroll(String grade) {
        course.addStudentGrade(name, grade);
    }

    public Set<String> getGrades() {
        LinkedHashMultimap<String, String> grades = course.getStudentGrades();
        return grades.get(name);
    }
}
