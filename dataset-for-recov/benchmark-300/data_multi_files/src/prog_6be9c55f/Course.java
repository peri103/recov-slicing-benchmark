import java.util.PriorityQueue;

public class Course {
    private PriorityQueue<Student> students = new PriorityQueue<>((s1, s2) -> s1.getAge() - s2.getAge());

    public void addStudent(Student student) {
        /* write */ students.offer(student);
    }

    public PriorityQueue<Student> getStudents() {
        return students;
    }
}
