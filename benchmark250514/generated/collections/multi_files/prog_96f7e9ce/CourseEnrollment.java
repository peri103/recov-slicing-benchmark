import org.apache.commons.collections4.map.Flat3Map;

public class CourseEnrollment {
    private Flat3Map<String, String> courses = new Flat3Map<>();

    public void addCourse(String courseName) {
        /* write */ courses.put(courseName, "Enrolled");
    }

    public String getCourseStatus(String courseName) {
        return courses.get(courseName);
    }
}
