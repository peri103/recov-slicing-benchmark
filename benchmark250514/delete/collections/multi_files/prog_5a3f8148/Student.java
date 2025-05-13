import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private ReferenceMapUtil referenceMapUtil = new ReferenceMapUtil();
    private Map<String, String> courses = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(String courseCode, String courseName) {
        courses.put(courseCode, courseName);
    }

    public void addScore(String courseCode, Integer score) {
        referenceMapUtil.addEntry(courseCode, score);
    }

    public Integer getScore(String courseCode) {
        return referenceMapUtil.getEntry(courseCode);
    }

    public Map<String, String> getCourses() {
        return courses;
    }
}
