import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to configure the CSVFormat
        /* write */ format = format.withIgnoreSurroundingSpaces(true);

        // Sample CSV data as a String
        String csvData = "Name, Age\nJohn Doe, 25";

        try {
            // Parse the CSV data using the configured format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Get the first record
            CSVRecord record = parser.iterator().next();

            // Use the read method to check if a value is set in the record
            /* read */ boolean isSet = record.isSet("Name");

            // Print the result
            System.out.println("Is 'Name' set in the record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}