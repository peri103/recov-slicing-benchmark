import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Course {
    private String courseName;
    private MultiValuedMap<String, Integer> assignments = new ArrayListValuedHashMap<>();
    private UnmodifiableMultiValuedMap<String, Integer> unmodifiableAssignments = new UnmodifiableMultiValuedMap<>(assignments);

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addAssignmentScore(String assignment, int score) {
        /* write */ assignments.put(assignment, score);
    }

    public Integer getAssignmentScore(String assignment) {
        /* read */ return unmodifiableAssignments.get(assignment).iterator().next();
    }
}
