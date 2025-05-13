import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT /* write */ .withIgnoreSurroundingSpaces();

        // Prepare a sample CSV data
        String csvData = "Name, Age\nJohn, 30\nJane, 25";

        try {
            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Use the read method to check consistency
            /* read */ boolean isConsistent = record.isConsistent();

            // Print the result
            System.out.println("Is the record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}