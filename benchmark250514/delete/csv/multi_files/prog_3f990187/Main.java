import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a sample CSV input
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Create a student and enroll in courses
            Student student = new Student("Alice", 20);
            student.enrollCourse("Mathematics");
            student.enrollCourse("Science");

            // Access student courses
            StudentCourses studentCourses = student.getCourses();
            ArrayList<String> courses = studentCourses.getCourseList();

            // Additional operations
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());

            // Print enrolled courses
            System.out.println("Enrolled Courses:");
            for (String course : courses) {
                System.out.println(course);
            }

            /* read */ String comment = record.getComment();
            
            // Print the comment
            System.out.println("CSV Comment: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}