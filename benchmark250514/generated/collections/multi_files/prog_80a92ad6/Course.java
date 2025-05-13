import org.apache.commons.collections4.map.HashedMap;

public class Course {
    private String courseName;
    private HashedMap<String, Integer> grades = new HashedMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(String studentName, int grade) {
        /* write */ grades.put(studentName, grade);
    }

    public int getGrade(String studentName) {
        /* read */ return grades.get(studentName);
    }
}
