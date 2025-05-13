import org.apache.commons.collections4.map.LinkedMap;

public class Course {
    private LinkedMap<String, Integer> courses = new LinkedMap<>();

    public void addCourse(String courseName, int credits) {
        /* write */ courses.put(courseName, credits);
    }

    public LinkedMap<String, Integer> getCourses() {
        return courses;
    }
}
