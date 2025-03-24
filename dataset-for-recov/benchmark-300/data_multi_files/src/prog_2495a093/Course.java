import java.util.concurrent.CopyOnWriteArrayList;

public class Course {
    private String courseName;
    private CopyOnWriteArrayList<Integer> studentIds = new CopyOnWriteArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudentId(int id) {
        /* write */ studentIds.add(id);
    }

    public CopyOnWriteArrayList<Integer> getStudentIds() {
        return studentIds;
    }

    public String getCourseName() {
        return courseName;
    }
}
