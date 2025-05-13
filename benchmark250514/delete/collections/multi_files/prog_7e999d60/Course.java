import org.apache.commons.collections4.map.AbstractMapDecorator;
import org.apache.commons.collections4.map.HashedMap;

public class Course {
    private String courseName;
    private AbstractMapDecorator<String, String> grades;

    public Course() {
        this.grades = new HashedMap<>();
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setGrade(String courseName, String grade) {
        /* write */ grades.put(courseName, grade);
    }

    public String getGrade(String courseName) {
        /* read */ return grades.get(courseName);
    }
}
