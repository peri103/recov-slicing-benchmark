import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int age;
    private Map<String, Integer> courseGrades = new HashMap<>();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addCourseGrade(String course, int grade) {
        courseGrades.put(course, grade);
    }

    public Map<String, Integer> getCourseGrades() {
        return courseGrades;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
