import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class CourseEnrollment {
    private ArrayListValuedHashMap<String, String> enrollments = new ArrayListValuedHashMap<>();

    public void enrollStudent(String course, String student) {
        /* write */ enrollments.put(course, student);
    }

    public ArrayListValuedHashMap<String, String> getEnrollments() {
        return enrollments;
    }
}