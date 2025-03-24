import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Integer> courses = new ArrayList<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void enrollInCourse(int courseId) {
        courses.add(courseId);
    }

    public List<Integer> getCourses() {
        return courses;
    }
}
