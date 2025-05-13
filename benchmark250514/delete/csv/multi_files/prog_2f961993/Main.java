import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a student and enroll them in courses
        Student student = new Student("Bob");
        student.enroll("Mathematics");
        student.enroll("Science");

        // Configure CSV format in the course
        Course course = student.getCourse();
        course.configureFormat();

        // Simulate a CSVRecord object
        CSVRecord record = new CSVRecord(null, null, null, course.getFormat());

        // Use CSVUtils to check if a column is mapped
        CSVUtils csvUtils = new CSVUtils();
        boolean isMapped = csvUtils.checkMapping(record, "Mathematics");

        // Output results
        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled Courses: " + course.getCourseNames());
        System.out.println("Is 'Mathematics' mapped: " + isMapped);
    }
}