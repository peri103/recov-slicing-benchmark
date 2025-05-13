import org.apache.commons.collections4.map.AbstractMapDecorator;
import java.util.HashMap;

public class Course {
    private String courseName;
    private AbstractMapDecorator<String, Integer> grades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.grades = new AbstractMapDecorator<String, Integer>(new HashMap<>()) {};
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(String studentName, int grade) {
        /* write */ grades.put(studentName, grade);
    }

    public Integer getGrade(String studentName) {
        return grades.get(studentName);
    }
}
