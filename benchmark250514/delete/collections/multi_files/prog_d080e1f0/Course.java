import org.apache.commons.collections4.map.MultiValueMap;

public class Course {
    private MultiValueMap<String, String> studentAssignments = new MultiValueMap<>();

    public void submitAssignment(String studentName, String assignment) {
        /* write */ studentAssignments.put(studentName, assignment);
    }

    public MultiValueMap<String, String> getStudentAssignments() {
        return studentAssignments;
    }
}
