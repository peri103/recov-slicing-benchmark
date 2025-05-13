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

    public void printStudentDetails() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
            System.out.println("Scores: ");
            for (int i = 0; i < student.getScore(i); i++) {
                System.out.println("Score " + i + ": " + student.getScore(i));
            }
        }
    }
}
