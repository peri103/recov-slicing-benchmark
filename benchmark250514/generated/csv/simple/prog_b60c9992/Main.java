import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim option
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "name, age, location\nJohn Doe, 30, New York";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read the first record
            CSVRecord record = records.get(0);

            // Check if a column is mapped
            /* read */ boolean isMapped = record.isMapped("name");

            // Output the result
            System.out.println("Is 'name' column mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}