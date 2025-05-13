import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class Course {
    private ReferenceMap<String, String> studentCourseMap;

    public Course() {
        studentCourseMap = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.SOFT);
    }

    public void addStudent(Student student, String courseName) {
        /* write */ studentCourseMap.put(student.getName(), courseName);
    }

    public String getCourseForStudent(String studentName) {
        /* read */ return studentCourseMap.get(studentName);
    }
}
