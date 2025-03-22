import java.util.concurrent.ConcurrentLinkedQueue;

public class Course {
    private String courseName;
    private ConcurrentLinkedQueue<Student> students = new ConcurrentLinkedQueue<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
