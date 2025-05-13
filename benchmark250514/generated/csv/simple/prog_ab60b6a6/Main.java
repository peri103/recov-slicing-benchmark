import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and configure it
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withAllowMissingColumnNames();

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse the CSV data using the configured CSVFormat
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Read a value from the CSVRecord
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("name");
            System.out.println(isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}