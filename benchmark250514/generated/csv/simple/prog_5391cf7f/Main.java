import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the specified configuration
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreEmptyLines(true);

        // Sample CSV data
        String csvData = "name,age,city\nJohn,30,New York\n\nAlice,25,Los Angeles";

        try {
            // Parse the CSV data using the configured CSVFormat
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Access a specific record and column
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}