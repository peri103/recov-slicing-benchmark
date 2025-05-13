import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<String> courseNames = new ArrayList<>();
    private CSVFormat format;

    public Course() {
        this.format = CSVFormat.DEFAULT;
    }

    public void addCourse(String courseName) {
        courseNames.add(courseName);
    }

    public List<String> getCourseNames() {
        return courseNames;
    }

    public void configureFormat() {
        /* write */ format = format.withIgnoreHeaderCase();
    }

    public CSVFormat getFormat() {
        return format;
    }
}
