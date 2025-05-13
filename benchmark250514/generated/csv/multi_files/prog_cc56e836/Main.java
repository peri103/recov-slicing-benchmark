import org.apache.commons.csv.CSVRecord;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "Name,Age\nJohn,30\nJane,25";
            CSVHandler csvHandler = new CSVHandler(csvData);

            // Create a student
            Student student = new Student("Alice", 20);
            student.enroll("Mathematics");
            student.enroll("Science");

            // Process student data
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());
            System.out.println("Enrolled Courses: " + student.getCourses());

            // Get the first record from CSV
            CSVRecord record = csvHandler.getFirstRecord();

            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println("Header Comment: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}