import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 29, New York";

            // Parse the sample CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record from the parsed CSV data
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method to check if the field 'Name' is mapped
            /* read */ boolean isMapped = record.isMapped("Name");

            // Print the result
            System.out.println("Is 'Name' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}