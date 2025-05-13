import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Configure CSV format
        CSVConfiguration csvConfig = new CSVConfiguration();
        csvConfig.configureFormat();

        // Create a dummy CSVRecord instance for demonstration
        CSVRecord record = null; // Assuming a record is obtained from a CSV parser

        // Check CSV record consistency
        CSVRecordChecker recordChecker = new CSVRecordChecker();
        boolean isConsistent = recordChecker.checkConsistency(record);
        System.out.println("CSVRecord is consistent: " + isConsistent);

        // Create a course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Output course details
        System.out.println("Course: " + course.getCourseName());
        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}