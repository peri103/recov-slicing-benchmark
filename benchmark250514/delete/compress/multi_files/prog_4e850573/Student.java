import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(String course) {
        courses.add(course);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
}
