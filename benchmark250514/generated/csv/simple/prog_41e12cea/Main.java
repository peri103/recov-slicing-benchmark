import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("HeaderComment");

            // Prepare a sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the records from the CSVParser
            List<CSVRecord> records = parser.getRecords();

            // Check if a specific header is set in the first record
            /* read */ boolean isSet = records.get(0).isSet("Name");

            // Output the result
            System.out.println(isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}