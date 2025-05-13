import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Course {
    private String courseName;
    private Multiset<String> studentNames = HashMultiset.create();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String studentName) {
        studentNames.add(studentName);
    }

    public void printStudentCounts() {
        for (String student : studentNames.elementSet()) {
            System.out.println(student + ": " + studentNames.count(student));
        }
    }
}
