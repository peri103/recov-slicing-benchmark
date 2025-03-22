import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void listStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
