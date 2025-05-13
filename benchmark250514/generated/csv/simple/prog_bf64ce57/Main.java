import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces();

        // Sample CSV data
        String csvData = "Name, Age\nJohn Doe, 29\nJane Smith, 34";
        
        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            // Get the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Use the read method to check if a specific column is set
            /* read */ boolean isSet = record.isSet("Name");
            System.out.println("Is 'Name' set: " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}