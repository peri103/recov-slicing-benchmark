import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allowing duplicate header names
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withAllowDuplicateHeaderNames(true);

        // Prepare a CSV string to parse
        String csvData = "header1,header1\nvalue1,value2";

        try {
            // Parse the CSV data using the csvFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the first column header is mapped
            /* read */ boolean isMapped = record.isMapped("header1");
            System.out.println(isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}