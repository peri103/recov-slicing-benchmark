import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the desired configuration
        CSVFormat csvFormat = CSVFormat.DEFAULT;

        // Use the write method to configure CSVFormat
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();

        // Sample CSV data
        String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            for (CSVRecord record : parser) {
                // Use the read method to check if a header is mapped
                /* read */ boolean isMapped = record.isMapped("Name");
                System.out.println("Is 'Name' mapped: " + isMapped);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}