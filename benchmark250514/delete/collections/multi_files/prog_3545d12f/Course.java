import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

public class Course {
    private String courseName;
    private AbstractOrderedBidiMapDecorator<String, Integer> studentGrades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentGrades = new AbstractOrderedBidiMapDecorator<>(new DualHashBidiMap<>());
    }

    public void addStudentGrade(String studentName, int grade) {
        /* write */ studentGrades.put(studentName, grade);
    }

    public Integer getStudentGrade(String studentName) {
        /* read */ return studentGrades.get(studentName);
    }

    public String getCourseName() {
        return courseName;
    }
}
