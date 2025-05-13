import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trimming
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "name, age, city\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(csvData, format);

            // Get the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Check if a mapping exists for a specific column
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' mapped: " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}