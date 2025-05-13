import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<String> courses;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(String course) {
        courses.add(course);
    }

    public List<String> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
