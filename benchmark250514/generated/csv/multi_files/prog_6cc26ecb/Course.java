import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<String> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(String studentName) {
        students.add(studentName);
    }

    public ArrayList<String> getStudents() {
        return students;
    }
}
