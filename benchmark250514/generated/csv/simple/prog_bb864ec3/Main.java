import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim enabled
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrim();

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Check if a mapping for a column exists
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}