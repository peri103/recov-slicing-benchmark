import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Course> courses = new ArrayList<>();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
