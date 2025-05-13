import java.util.ArrayList;

public class StudentCourses {
    private ArrayList<String> courseList = new ArrayList<>();

    public void addCourse(String courseName) {
        /* write */ courseList.add(courseName);
    }

    public ArrayList<String> getCourseList() {
        return courseList;
    }
}
