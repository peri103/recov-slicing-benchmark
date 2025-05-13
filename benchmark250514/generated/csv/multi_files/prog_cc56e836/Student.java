import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private ArrayList<String> courses;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public void enroll(String course) {
        courses.add(course);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
