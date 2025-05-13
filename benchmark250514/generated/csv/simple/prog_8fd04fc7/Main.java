import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance and apply the 'withTrim' method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrim();

            // Create a sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Use the 'isMapped' method on the CSVRecord
            /* read */ boolean isMapped = record.isMapped("name");

            // Output the result
            System.out.println(isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}