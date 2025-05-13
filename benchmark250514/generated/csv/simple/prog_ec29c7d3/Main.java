import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and configure it
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();

            // Sample CSV data
            String csvData = "Name, Age\nJohn, 30\nJane, 25";

            // Parse the CSV data using the configured CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Read from the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isMapped = record.isMapped("name");

            System.out.println("Is 'name' mapped: " + isMapped);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}