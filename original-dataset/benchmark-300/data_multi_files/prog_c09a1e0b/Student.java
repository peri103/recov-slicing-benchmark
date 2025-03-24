import java.util.HashSet;

public class Student {
    private int studentId;
    private String studentName;
    private HashSet<String> enrolledCourses = new HashSet<>();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void enrollInCourse(String courseName) {
        enrolledCourses.add(courseName);
    }

    public HashSet<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
