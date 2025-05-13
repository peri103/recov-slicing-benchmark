import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with the specified write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

            // Prepare a sample CSV data
            String csvData = "Name, Age, City\nJohn Doe, 30, New York";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read the first record and check consistency using the specified read method
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isConsistent = firstRecord.isConsistent();

            // Print the result of the read operation
            System.out.println("Is the first record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}