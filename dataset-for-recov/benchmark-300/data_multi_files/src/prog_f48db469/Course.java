import java.util.TreeSet;

public class Course {
    private TreeSet<Integer> studentIds = new TreeSet<>();

    public void enrollStudent(int studentId) {
        /* write */ studentIds.add(studentId);
    }

    public TreeSet<Integer> getStudentIds() {
        return studentIds;
    }
}
