import java.util.ArrayList;

public class StudentCourses {
    private ArrayList<String> courses = new ArrayList<>();

    public void addCourse(String courseName) {
        /* write */ courses.add(courseName);
    }

    public boolean isEnrolled(String courseName) {
        return courses.contains(courseName);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }
}
