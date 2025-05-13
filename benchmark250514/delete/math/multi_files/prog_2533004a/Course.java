import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getCourseAverage() {
        double total = 0;
        for (Student student : students) {
            total += student.getAverageGrade();
        }
        return students.isEmpty() ? 0 : total / students.size();
    }
}
