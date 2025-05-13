import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import org.apache.commons.collections4.map.LinkedMap;

public class Course {
    private String courseName;
    private AbstractOrderedMapDecorator<String, Integer> grades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.grades = new LinkedMap<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(String studentName, int grade) {
        /* write */ grades.put(studentName, grade);
    }

    public int getGrade(String studentName) {
        return grades.get(studentName);
    }
}
