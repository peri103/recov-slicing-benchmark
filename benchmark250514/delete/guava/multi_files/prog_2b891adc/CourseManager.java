import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;

public class CourseManager {
    private Multiset<String> courseEnrollment;

    public CourseManager() {
        this.courseEnrollment = LinkedHashMultiset.create();
    }

    public void enrollStudent(String courseName) {
        /* write */ courseEnrollment.add(courseName);
    }

    public int getEnrollmentCount(String courseName) {
        /* read */ return courseEnrollment.count(courseName);
    }
}
