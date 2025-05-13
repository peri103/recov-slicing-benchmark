import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<String> courses;
    private PredicatedBagWrapper bagWrapper;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.bagWrapper = new PredicatedBagWrapper();
    }

    public void enrollCourse(String course) {
        courses.add(course);
        bagWrapper.addElement(course);
    }

    public List<String> getCourses() {
        return courses;
    }

    public int getCourseCount(String course) {
        return bagWrapper.getElementCount(course);
    }
}
