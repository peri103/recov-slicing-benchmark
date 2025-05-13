import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Instantiate CSVHandler and configure the format
            CSVHandler csvHandler = new CSVHandler();
            csvHandler.configureFormat();

            // Prepare a CSV string with a comment
            String csvData = "# This is a comment\nname,age\nJohn,30";

            // Parse the CSV data
            List<CSVRecord> records = csvHandler.parseCSV(csvData);

            // Extract the comment using CommentExtractor
            CommentExtractor commentExtractor = new CommentExtractor();
            String comment = commentExtractor.extractComment(records);
            System.out.println("Extracted Comment: " + comment);

            // Create and interact with Student and Course objects
            Student student = new Student("Alice");
            student.addCourse("Mathematics");
            student.addCourse("Physics");

            Course course = new Course("Chemistry", 4);
            System.out.println("Course Title: " + course.getTitle() + ", Credits: " + course.getCredits());

            System.out.println("Student Name: " + student.getName());
            System.out.println("Enrolled Courses: " + student.getCourses());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}