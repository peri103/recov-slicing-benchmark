import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Define a sample CSV input
        String csvData = "name, age\nJohn Doe, 30";

        try {
            // Create a CSVFormat object with trimming enabled
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the record is mapped (it should be since we have headers)
            /* read */ boolean isMapped = record.isMapped("name");

            // Print the result
            System.out.println("Is 'name' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}