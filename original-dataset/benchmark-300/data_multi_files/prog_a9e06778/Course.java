import java.util.concurrent.ConcurrentSkipListSet;

public class Course {
    private String name;
    private ConcurrentSkipListSet<String> enrolledStudents = new ConcurrentSkipListSet<>();

    public Course(String name) {
        this.name = name;
    }

    public void enrollStudent(String studentName) {
        /* write */ enrolledStudents.add(studentName);
    }

    public ConcurrentSkipListSet<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getName() {
        return name;
    }
}
