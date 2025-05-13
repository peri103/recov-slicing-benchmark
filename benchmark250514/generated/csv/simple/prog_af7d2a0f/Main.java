import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with the write method
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withAllowDuplicateHeaderNames(true);

        // Prepare a sample CSV input
        String csvData = "header1,header1\nvalue1,value2";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Read using the read method
            CSVRecord record = records.get(0);
            /* read */ boolean isMapped = record.isMapped("header1");

            // Output the result
            System.out.println("Is 'header1' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}