import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<String> courses;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public List<String> getCourses() {
        return courses;
    }

    public boolean checkRecordConsistency(CSVRecord record) {
        /* read */ return record.isConsistent();
    }
}
