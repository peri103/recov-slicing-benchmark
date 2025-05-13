import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Course {
    private String courseName;
    private Multiset<Student> studentMultiset = HashMultiset.create();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        /* write */ studentMultiset.add(student);
    }

    public int getEnrollmentCount() {
        /* read */ return studentMultiset.count(studentMultiset.elementSet().iterator().next());
    }

    public String getCourseName() {
        return courseName;
    }
}
