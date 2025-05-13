import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int age;
    private Map<String, Integer> courseScores;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.courseScores = new HashMap<>();
    }

    public void addCourseScore(String course, int score) {
        courseScores.put(course, score);
    }

    public int getCourseScore(String course) {
        return courseScores.getOrDefault(course, 0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
