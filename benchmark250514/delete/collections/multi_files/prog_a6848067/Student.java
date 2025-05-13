import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private CourseMap courseMap;

    public Student(String name) {
        this.name = name;
        this.courseMap = new CourseMap();
    }

    public void addCourseScore(String course, int score) {
        courseMap.addScore(course, score);
    }

    public int getCourseScore(String course) {
        return courseMap.getScore(course);
    }

    public String getName() {
        return name;
    }
}
