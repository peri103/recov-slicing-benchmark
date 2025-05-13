import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.Collection;

public class Course {
    private String courseName;
    private HashSetValuedHashMap<String, String> studentAssignments;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentAssignments = new HashSetValuedHashMap<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void submitAssignment(String studentName, String assignment) {
        /* write */ studentAssignments.put(studentName, assignment);
    }

    public Collection<String> getAssignments(String studentName) {
        return studentAssignments.get(studentName);
    }
}
