import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "name,age\nJohn,30\nJane,25";

        // Initialize CSV utilities
        CSVUtilities csvUtilities = new CSVUtilities(csvData);

        // Create a new student
        Student student = new Student("John", 30);
        student.addCourse("Math");
        student.addCourse("Science");

        // Print student courses
        List<String> courses = student.getCourses();
        for (String course : courses) {
            System.out.println("Course: " + course);
        }

        // Get the first CSV record
        CSVRecord firstRecord = csvUtilities.getRecords().get(0);

        // Check if the CSV record is consistent
        boolean isConsistent = student.checkRecordConsistency(firstRecord);
        System.out.println("Is the first record consistent? " + isConsistent);
    }
}