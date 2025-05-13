import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class Course {
    private String courseName;
    private AbstractOrderedBidiMapDecorator<String, Integer> grades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.grades = new AbstractOrderedBidiMapDecorator<>(new TreeBidiMap<>());
    }

    public void addStudentGrade(String studentName, int grade) {
        /* write */ grades.put(studentName, grade);
    }

    public Integer getStudentGrade(String studentName) {
        return grades.get(studentName);
    }

    public String getCourseName() {
        return courseName;
    }
}
