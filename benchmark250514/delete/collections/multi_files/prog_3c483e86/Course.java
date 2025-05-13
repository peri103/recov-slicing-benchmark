import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.map.TreeBidiMap;

public class Course {
    private String courseName;
    private AbstractOrderedBidiMapDecorator<String, Integer> grades;

    public Course() {
        this.grades = new AbstractOrderedBidiMapDecorator<>(new TreeBidiMap<>());
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(String subject, int grade) {
        /* write */ grades.put(subject, grade);
    }

    public int getGrade(String subject) {
        /* read */ return grades.get(subject);
    }
}
