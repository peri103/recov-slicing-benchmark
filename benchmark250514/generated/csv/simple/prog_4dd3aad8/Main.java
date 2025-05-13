import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific configuration
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase();

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0); // Get the first record

            // Check if the record is mapped
            /* read */ boolean isMapped = record.isMapped("Name");

            // Output the result
            System.out.println("Is 'Name' mapped in the record? " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}