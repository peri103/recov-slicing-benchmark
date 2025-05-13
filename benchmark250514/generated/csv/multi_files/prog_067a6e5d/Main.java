import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("John Doe", 29, "USA");
        student.enrollCourse("Math");
        student.enrollCourse("Science");

        // Print student details
        System.out.println("Student: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Location: " + student.getLocation());
        System.out.println("Enrolled Courses: " + student.getCourses());

        // Create a course with CSV data
        String csvData = "Name, Age, Location\nJohn Doe, 29, USA\nJane Smith, 34, UK";
        Course course = new Course("Math", csvData);

        // Read the first record and check if a column is mapped
        List<CSVRecord> records = course.getRecords();
        CSVRecord record = records.get(0);
        /* read */ boolean isMapped = record.isMapped("name");

        // Output the result
        System.out.println("Is 'name' mapped in the course records: " + isMapped);
    }
}