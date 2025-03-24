import java.util.TreeSet;

public class Course {
    private String courseName;
    private TreeSet<Integer> studentIds = new TreeSet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(int studentId) {
        /* write */ studentIds.add(studentId);
    }

    public TreeSet<Integer> getStudentIds() {
        return studentIds;
    }

    public String getCourseName() {
        return courseName;
    }
}
