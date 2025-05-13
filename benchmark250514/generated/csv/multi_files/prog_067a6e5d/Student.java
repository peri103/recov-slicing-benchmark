import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String location;
    private List<String> courses;

    public Student(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
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

    public String getLocation() {
        return location;
    }
}
