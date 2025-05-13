import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.multiset.HashMultiSet;

public class Course {
    private String courseName;
    private MultiSet<String> enrolledStudents = new HashMultiSet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(String studentName) {
        enrolledStudents.add(studentName);
    }

    public void printEnrollment() {
        for (String student : enrolledStudents.uniqueSet()) {
            System.out.println(student + ": " + enrolledStudents.getCount(student));
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
