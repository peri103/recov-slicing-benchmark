import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int age;
    private Map<String, Integer> courses;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.courses = new HashMap<>();
    }

    public void addCourse(String courseName, int score) {
        courses.put(courseName, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student Name: ").append(name).append(", Age: ").append(age).append("\nCourses:\n");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            sb.append("Course: ").append(entry.getKey()).append(", Score: ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}