import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVHandler and parse CSV data
            CSVHandler csvHandler = new CSVHandler();
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            List<CSVRecord> records = csvHandler.parseCSV(csvData);

            // Create a CSVCommentReader to read the comment
            CSVCommentReader commentReader = new CSVCommentReader();
            String comment = commentReader.readComment(records);
            System.out.println("Comment: " + comment);

            // Create a Course and add students
            Course course = new Course("Computer Science");
            course.addStudent("Alice");
            course.addStudent("Bob");

            // Print course details
            System.out.println("Course: " + course.getCourseName());
            for (String studentName : course.getStudentNames()) {
                System.out.println("Student: " + studentName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}