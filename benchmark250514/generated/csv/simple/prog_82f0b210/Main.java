import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a CSVFormat object with an escape character
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withEscape('\\');

            // Prepare a sample CSV input
            String csvData = "name,age\\,location\nJohn Doe,30\\,New York";

            // Parse the CSV data using the CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Assume we want to read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Read the record as a string
            /* read */ String recordString = record.toString();

            // Output the read string
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}