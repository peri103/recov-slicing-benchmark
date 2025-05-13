import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "name,age\nJohn Doe,25\nJane Smith,30";

        // Create a CSVProcessor instance
        CSVProcessor csvProcessor = new CSVProcessor();

        try {
            // Parse the CSV data
            List<CSVRecord> records = csvProcessor.parseCSV(csvData);

            // Create a student instance using data from the first record
            CSVRecord firstRecord = records.get(0);
            Student student = new Student(firstRecord.get("name"), Integer.parseInt(firstRecord.get("age")));

            // Enroll student in courses
            student.enrollCourse("Math");
            student.enrollCourse("Science");

            // Read the first record and check if a specific field is mapped
            boolean isMapped = firstRecord.isMapped("name"); /* read */

            // Output the result
            System.out.println("Is 'name' field mapped in the first record? " + isMapped);

            // Output student information
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());
            System.out.println("Enrolled Courses: " + student.getCourses());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}