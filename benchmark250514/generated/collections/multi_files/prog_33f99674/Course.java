import org.apache.commons.collections4.map.LRUMap;

public class Course {
    private String courseName;
    private LRUMap<String, String> grades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.grades = new LRUMap<>(5);
    }

    public void addGrade(String studentName, String grade) {
        /* write */ grades.put(studentName, grade);
    }

    public String getGrade(String studentName) {
        return grades.get(studentName);
    }

    public String getCourseName() {
        return this.courseName;
    }
}
