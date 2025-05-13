import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<String> courses;
    private LinkManager linkManager;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.linkManager = new LinkManager();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setLinkName(String linkName) {
        linkManager.setLinkName(linkName);
    }

    public String getLinkName() {
        return linkManager.getLinkName();
    }
}
