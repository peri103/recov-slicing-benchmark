import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();

            // Access a specific record and check if a specific column is set
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' column set in the first record? " + isSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}