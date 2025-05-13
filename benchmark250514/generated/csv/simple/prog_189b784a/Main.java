import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with first record as header
            CSVFormat csvFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader(); /* write */

            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn Doe,30,New York\nJane Smith,25,Los Angeles";

            // Parse the CSV data
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Get the first record
            CSVRecord record = records.get(0);

            // Check if a particular header is mapped
            boolean isMapped = record.isMapped("Name"); /* read */
            System.out.println("Is 'Name' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}