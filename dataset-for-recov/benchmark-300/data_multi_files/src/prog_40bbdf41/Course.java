import java.util.PriorityQueue;

public class Course {
    private String courseName;
    private PriorityQueue<Student> students = new PriorityQueue<>((s1, s2) -> s1.getGrades().peek() - s2.getGrades().peek());

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.offer(student);
    }

    public PriorityQueue<Student> getStudents() {
        return students;
    }
}
