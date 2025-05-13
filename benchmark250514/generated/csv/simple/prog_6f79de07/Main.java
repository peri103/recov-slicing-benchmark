import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a trailing delimiter
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withTrailingDelimiter();

        // Sample CSV data
        String csvData = "name,age,city\nJohn,23,New York\nJane,29,Los Angeles\n";

        try {
            // Parse the CSV data
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Access a CSVRecord
            CSVRecord record = records.get(0);

            // Check if a specific column is set
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}