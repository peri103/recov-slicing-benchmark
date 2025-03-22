import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
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
