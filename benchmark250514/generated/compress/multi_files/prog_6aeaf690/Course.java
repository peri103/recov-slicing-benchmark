import java.util.ArrayList;

public class Course {
    private String title;
    private ArrayList<Student> students;

    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double calculateCourseAverage() {
        double total = 0;
        for (Student student : students) {
            total += student.calculateAverage();
        }
        return students.size() > 0 ? total / students.size() : 0.0;
    }

    public String getTitle() {
        return title;
    }
}
