import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Simulating CSV data with a comment
        String csvData = "# This is a comment\nName,Age\nJohn,30";

        // Handling CSV operations
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.configureFormat();

        try {
            List<CSVRecord> records = csvHandler.parseCSV(csvData);

            // Extracting comment
            CommentExtractor extractor = new CommentExtractor();
            String comment = extractor.extractComment(records);
            System.out.println(comment); // Output the comment

            // Create a student and add courses
            Student student = new Student("John");
            student.addCourse("Math");
            student.addCourse("Science");

            // Output student details
            System.out.println("Student: " + student.getCourses());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}