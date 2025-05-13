import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";

        try {
            // Create a CSVFormat object with the specified configuration
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withIgnoreSurroundingSpaces();

            // Parse the CSV data using the configured CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            for (CSVRecord record : parser) {
                // Check if a specific column is set in the current record
                /* read */ boolean isSet = record.isSet("Name");
                System.out.println("Is 'Name' column set? " + isSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}