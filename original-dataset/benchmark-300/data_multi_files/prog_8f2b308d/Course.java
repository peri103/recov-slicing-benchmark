import java.util.concurrent.ConcurrentSkipListMap;

public class Course {
    private ConcurrentSkipListMap<Integer, Student> students = new ConcurrentSkipListMap<>();

    public void addStudent(int id, Student student) {
        /* write */ students.put(id, student);
    }

    public ConcurrentSkipListMap<Integer, Student> getStudents() {
        return students;
    }
}
