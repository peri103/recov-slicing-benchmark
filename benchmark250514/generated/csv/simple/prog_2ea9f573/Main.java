import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV format with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Sample CSV data
        String csvData = "name,age\nJohn,30\nDoe,25";

        try {
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve records
            List<CSVRecord> records = parser.getRecords();

            // Use the read method on the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' set in the first record? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}