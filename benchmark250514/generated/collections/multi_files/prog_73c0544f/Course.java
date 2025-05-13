import org.apache.commons.collections4.map.ReferenceMap;

public class Course {
    private String courseName;
    private ReferenceMap<String, String> studentGrades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentGrades = new ReferenceMap<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(String studentName, String grade) {
        /* write */ studentGrades.put(studentName, grade);
    }

    public String getGrade(String studentName) {
        return studentGrades.get(studentName);
    }
}
