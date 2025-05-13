import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and apply withTrailingDelimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Create a sample CSV input
            String csvData = "Name,Age\nJohn,30\nJane,25\n";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific field is set
            /* read */ boolean isSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' set in the record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}