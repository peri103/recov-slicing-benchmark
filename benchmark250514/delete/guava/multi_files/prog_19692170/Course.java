import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.ArrayListMultimap;
import java.util.Collection;

public class Course {
    private ForwardingMultimap<String, String> studentAssignments = new ForwardingMultimap<String, String>() {
        private final ArrayListMultimap<String, String> delegate = ArrayListMultimap.create();

        @Override
        protected ArrayListMultimap<String, String> delegate() {
            return delegate;
        }
    };

    public void addAssignment(String studentName, String assignment) {
        /* write */ studentAssignments.put(studentName, assignment);
    }

    public Collection<String> getAssignments(String studentName) {
        return studentAssignments.get(studentName);
    }
}