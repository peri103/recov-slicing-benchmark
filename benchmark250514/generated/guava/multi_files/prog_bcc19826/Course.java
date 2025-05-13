import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Multimap;

public class Course {
    private String courseName;
    private ForwardingMultimap<String, String> assignments;

    public Course(String courseName) {
        this.courseName = courseName;
        this.assignments = new ForwardingMultimap<String, String>() {
            private final Multimap<String, String> delegate = ArrayListMultimap.create();

            @Override
            protected Multimap<String, String> delegate() {
                return delegate;
            }
        };
    }

    public void addAssignment(String studentName, String assignmentDetail) {
        /* write */ assignments.put(studentName, assignmentDetail);
    }

    public String getAssignmentDetail(String studentName) {
        /* read */ return assignments.get(studentName).iterator().next();
    }

    public String getCourseName() {
        return courseName;
    }
}
