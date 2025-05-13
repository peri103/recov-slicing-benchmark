import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat csvFormat = CSVFormat.DEFAULT.withNullString("NULL");
            /* write */ csvFormat = csvFormat.withNullString("NULL");

            // Prepare a sample CSV data
            String csvData = "Name,Age,Location\nJohn,NULL,New York\nDoe,25,NULL";

            // Parse CSV data using the format
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Read the value using the read method
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Location");
            System.out.println("Is 'Location' set for the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}