import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<String> courses = new ArrayList<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void enrollCourse(String courseName) {
        courses.add(courseName);
    }

    public List<String> getCourses() {
        return courses;
    }

    public int getId() {
        return id;
    }
}
