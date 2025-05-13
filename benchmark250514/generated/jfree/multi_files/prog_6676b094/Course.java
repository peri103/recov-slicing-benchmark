import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void printStudentAverages() {
        for (Student student : students) {
            System.out.println(student.getName() + "'s average grade: " + student.getAverageGrade());
        }
    }
}