import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance with a trailing delimiter
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

        // Sample CSV data
        String csvData = "name,email,age\nJohn Doe,john.doe@example.com,30\n";

        try {
            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Check if a specific column is set
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' column set? " + isSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}