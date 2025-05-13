import java.util.ArrayList;

public class StudentCourses {
    private ArrayList<String> courses = new ArrayList<>();

    public void addCourse(String courseName) {
        /* write */ courses.add(courseName);
    }

    public String getCourse(int index) {
        return courses.get(index);
    }

    public int getTotalCourseLength() {
        int totalLength = 0;
        for (String course : courses) {
            totalLength += course.length();
        }
        return totalLength;
    }
}
