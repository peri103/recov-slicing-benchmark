import java.util.LinkedList;

public class School {
    private LinkedList<Course> courses;

    public School() {
        this.courses = new LinkedList<>();
    }

    public void addCourse(Course course) {
        courses.addLast(course);
    }

    public LinkedList<Course> getCourses() {
        return courses;
    }
}