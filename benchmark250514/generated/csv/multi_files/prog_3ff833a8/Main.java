import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVHandler and configure format
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.configureFormat();

        // Mock CSV data
        String csvData = "\"value1\",\"value2\",\"value3\"\n\"value4\",\"value5\",\"value6\"";

        // Parse CSV data
        List<CSVRecord> records = null;
        try {
            records = csvHandler.parseCSV(csvData);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Process and print CSVRecords
        if (records != null && !records.isEmpty()) {
            CSVRecord firstRecord = records.get(0);
            CSVRecord secondRecord = records.get(1);

            // Print details of the first record
            System.out.println("First Record:");
            for (String value : firstRecord) {
                System.out.println("Value: " + value);
            }

            // Print details of the second record
            System.out.println("Second Record:");
            for (String value : secondRecord) {
                System.out.println("Value: " + value);
            }

            // Create a student and print courses
            Student student = new Student("John Doe", Arrays.asList("Math", "Science", "History"));
            student.printCourses();

            // Read and print the CSVRecord
            /* read */ String recordString = firstRecord.toString();
            System.out.println("First Record String: " + recordString);
        }
    }
}