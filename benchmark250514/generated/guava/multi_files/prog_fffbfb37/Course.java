import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Course {
    private Multiset<String> studentNames;

    public Course() {
        this.studentNames = HashMultiset.create();
    }

    public void enrollStudent(String studentName) {
        /* write */ studentNames.add(studentName);
    }

    public int getEnrollmentCount(String studentName) {
        return studentNames.count(studentName);
    }

    public Multiset<String> getAllEnrollments() {
        return studentNames;
    }
}
