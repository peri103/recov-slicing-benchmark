import java.util.concurrent.ConcurrentSkipListSet;

public class Course {
    private ConcurrentSkipListSet<Integer> studentIds = new ConcurrentSkipListSet<>();

    public void enrollStudent(int studentId) {
        /* write */ studentIds.add(studentId);
    }

    public ConcurrentSkipListSet<Integer> getStudentIds() {
        return studentIds;
    }
}
